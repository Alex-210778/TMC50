package by.tms.homework8.garage.cars;

import by.tms.homework8.garage.ColorCar;

public class Toyota extends Car {

    public Toyota(String model, int yearOfManufacture, ColorCar colorCar, double engineVolume) {
        super(model, yearOfManufacture, colorCar, engineVolume);
        this.brand = "Toyota";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", colorCar=" + colorCar +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
