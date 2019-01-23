package Chapter_10.Exercise_Solving;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<CarbonFootPrint> carbonFootPrintObjects = new ArrayList<>();

        // adding objects to the collection
        carbonFootPrintObjects.add(new Building("Trump Tower", "721 Fifth Avenue New York City",
                "Retail, Office and residential", 1983, 4870));
        carbonFootPrintObjects.add(new Car("Mazda", "TS 2.0", 2002, 35000, 874));
        carbonFootPrintObjects.add(new Bicycle("X-race", "machine-powered", 120, 320));
        carbonFootPrintObjects.add(new Bicycle("E-Mountain", "machine-powered", 987, 195));
        carbonFootPrintObjects.add(new Building("La Bonitos", "56 Briardene St Cape Town", "Residential", 2011, 3567));

        for (CarbonFootPrint currentObject : carbonFootPrintObjects) {
            System.out.printf("%s%n%s %.2f tCO2e%n%n", currentObject, "Carbon Emission value:", currentObject.getCarbonFootPrint()); // tCO2e: tonnes of carbon dioxide equivalent
        }
    }

}
