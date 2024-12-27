package capitulo10;

public class Car implements CarbonFootprint{

    private final String brand;
    private final String model;
    private final int year;
    private final double distancePercorrida;
    private final double consumoAverage;
    private final double rateEmissao;

    public Car(String brand, String model, int year, double distancePercorrida, double consumoAverage, double rateEmissao) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.distancePercorrida = distancePercorrida;
        this.consumoAverage = consumoAverage;
        this.rateEmissao = rateEmissao;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getDistancePercorrida() {
        return distancePercorrida;
    }

    public double getConsumoAverage() {
        return consumoAverage;
    }

    public double getRateEmissao() {
        return rateEmissao;
    }

    @Override
    public double getCarbonFootprint() {
        return getConsumoAverage() * getRateEmissao() * getDistancePercorrida();
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %s%n%s: %s%n%s: %s", "Brand", getBrand(), "Model", getModel(), "Year",getYear(), "Distancia percorrida", getDistancePercorrida(), "Consumo médio", getConsumoAverage(), "Taxa de emissão", getRateEmissao());
    }
}
