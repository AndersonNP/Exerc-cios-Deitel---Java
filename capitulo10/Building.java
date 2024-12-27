package capitulo10;

public class Building implements CarbonFootprint{

    private final String address;
    private final int floors;
    private final int yearBuilt;
    private final double energyConsumo;
    private final double rateEmissao;

    public Building(String address, int floors, int yearBuilt, double energyConsumo, double rateEmissao) {
        this.address = address;
        this.floors = floors;
        this.yearBuilt = yearBuilt;
        this.energyConsumo = energyConsumo;
        this.rateEmissao = rateEmissao;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getFloors() {
        return floors;
    }

    public String getAddress() {
        return address;
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
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %s%n%s: %s", "Address", getAddress(), "Floors", getFloors(), "Yeat Built", getYearBuilt(), "Consumo Energetico", getEnergyConsumo(), "Taxa de emissão", getRateEmissao());
    }
}
