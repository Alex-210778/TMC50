package by.tms.homework8.mains;

import by.tms.homework8.garage.*;
import by.tms.homework8.garage.cars.*;

import java.util.HashMap;

public class GarageMain {

    public static void main(String[] args) {
        Garage garage = new Garage(new HashMap<>());

        Car whiteAudi = new Audi("A4", 2010, ColorCar.WHITE, 1.6);
        Car redAudi = new Audi("A6", 2012, ColorCar.RED, 1.8);
        Car blackAudi = new Audi("S9", 2020, ColorCar.BLACK, 3.0);
        Car brownBMW = new BMW("X3", 2015, ColorCar.BROWN, 1.4);
        Car greenBMW = new BMW("X1", 2017, ColorCar.GREEN, 1.4);
        Car blackBMW = new BMW("X5", 2020, ColorCar.BLACK, 2.4);
        Car yellowMersedes = new Mersedes("AMG", 2018, ColorCar.YELLOW, 1.6);
        Car blueMersedes = new Mersedes("A200", 2019, ColorCar.BLUE, 1.8);
        Car whiteMersedes = new Mersedes("GLE400", 2021, ColorCar.WHITE, 3.0);
        Car redToyota = new Toyota("Corolla", 2015, ColorCar.RED, 1.6);
        Car whiteToyota = new Toyota("Land Cruiser", 2019, ColorCar.WHITE, 3.0);
        Car blackToyota = new Toyota("RAV4", 2014, ColorCar.BLACK, 2.4);

        System.out.println("Количество машин в гараже: " + garage);
        garage.leavingFromGarage(whiteAudi);
        System.out.println("Количество машин в гараже: " + garage);
        garage.parkingInGarage(yellowMersedes);
        garage.parkingInGarage(yellowMersedes);
        garage.parkingInGarage(whiteAudi);
        garage.parkingInGarage(whiteAudi);
        garage.parkingInGarage(redAudi);
        garage.parkingInGarage(redToyota);
        garage.parkingInGarage(redToyota);
        garage.parkingInGarage(redAudi);
        garage.leavingFromGarage(redAudi);
        garage.parkingInGarage(blueMersedes);
        garage.parkingInGarage(blueMersedes);
        garage.parkingInGarage(blueMersedes);
        garage.parkingInGarage(blueMersedes);
        garage.parkingInGarage(blueMersedes);
        garage.parkingInGarage(brownBMW);
        System.out.println("Количество машин в гараже: " + garage);
        System.out.println("Количество машин " + blueMersedes + " - " + garage.getStatisticsAutoInGarage(blueMersedes));
        garage.leavingFromGarage(blueMersedes);
        System.out.println("Количество машин " + blueMersedes + " - " + garage.getStatisticsAutoInGarage(blueMersedes));
        System.out.println("Количество машин " + greenBMW + " - " + garage.getStatisticsAutoInGarage(greenBMW));
    }
}
