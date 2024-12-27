package capitulo10;

import java.util.ArrayList;

public class CarbonFootPrintTest {
    public static void main(String[] args) {

        Building building = new Building("Rua 03H, 97", 2,2014, 1000.0, 0.2);
        Car car = new Car("Fiat", "Argo", 2020, 10000, 20, 0.2);
        Bicycle bicycle = new Bicycle("X", "Y", 100, 0.1);


        ArrayList<CarbonFootprint> list = new ArrayList<>();
        list.add(building);
        list.add(car);
        list.add(bicycle);

        for (CarbonFootprint carbonFootprint : list){
            System.out.printf("%s%n%s: %s%n%n",carbonFootprint,"Pegada de Carbono: ", carbonFootprint.getCarbonFootprint());
        }


    }
}
