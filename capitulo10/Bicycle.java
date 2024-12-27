package capitulo10;

public class Bicycle implements CarbonFootprint{

    private final String brand;
    private final String model;
    private final double energyConsumo;
    private final double rateEmissao;

    public Bicycle(String brand, String model, double energyConsumo, double rateEmissao) {
        this.brand = brand;
        this.model = model;
        this.energyConsumo = energyConsumo;
        this.rateEmissao = rateEmissao;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEnergyConsumo() {
        return energyConsumo;
    }

    public double getRateEmissao() {
        return rateEmissao;
    }

    @Override
    public double getCarbonFootprint() {
        return getEnergyConsumo() * getRateEmissao();
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %s", "Brand", getBrand(), "Model", getModel(), "Consumo Energetico", getEnergyConsumo(), "Taxa de emissão", getRateEmissao());
    }
}
