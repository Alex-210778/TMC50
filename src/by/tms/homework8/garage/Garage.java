package by.tms.homework8.garage;

import by.tms.homework8.garage.cars.Car;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    Map<Car, Integer> carsInGarage = new HashMap<>();

    public Garage(Map<Car, Integer> carsInGarage) {
        this.carsInGarage = carsInGarage;
    }

    public Map<Car, Integer> parkingInGarage(Car car) {
        if (car instanceof Car && !carsInGarage.containsKey(car)) {
            carsInGarage.put(car, 1);
        } else {
            carsInGarage.put(car, carsInGarage.get(car) + 1);
        }
        return carsInGarage;
    }

    public Map<Car, Integer> leavingFromGarage(Car car) {
        if (car instanceof Car && carsInGarage.containsKey(car)) {
            if (carsInGarage.get(car) != 1) {
                carsInGarage.put(car, carsInGarage.get(car) - 1);
            } else {
                carsInGarage.remove(car);
            }
        }
        return carsInGarage;
    }

    public Map<Car, Integer> getStatisticsAutoInGarage(Car car) {
        Map<Car, Integer> statistics = new HashMap<>();
        if (car instanceof Car) {
            if (carsInGarage.containsKey(car)) {
                statistics.put(car, carsInGarage.get(car));
            }
        }
        return statistics;
    }

    public Map<Car, Integer> getCarsInGarage() {
        return carsInGarage;
    }

    public void setCarsInGarage(Map<Car, Integer> carsInGarage) {
        this.carsInGarage = carsInGarage;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "carsInGarage=" + carsInGarage +
                '}';
    }
}

