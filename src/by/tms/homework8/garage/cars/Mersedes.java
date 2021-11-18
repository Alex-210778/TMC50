package by.tms.homework8.garage.cars;

import by.tms.homework8.garage.ColorCar;

public class Mersedes extends Car {

    public Mersedes(String model, int yearOfManufacture, ColorCar colorCar, double engineVolume) {
        super(model, yearOfManufacture, colorCar, engineVolume);
        this.brand = "Mersedes";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Mersedes{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", colorCar=" + colorCar +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
