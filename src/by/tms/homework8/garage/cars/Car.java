package by.tms.homework8.garage.cars;

import by.tms.homework8.garage.ColorCar;

public abstract class Car {
    protected String brand;
    protected String model;
    protected int yearOfManufacture;
    protected ColorCar colorCar;
    protected double engineVolume;

    public Car(String model, int yearOfManufacture, ColorCar colorCar, double engineVolume) {

        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.colorCar = colorCar;
        this.engineVolume = engineVolume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public ColorCar getColorCar() {
        return colorCar;
    }

    public void setColorCar(ColorCar colorCar) {
        this.colorCar = colorCar;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        if (yearOfManufacture != car.yearOfManufacture) return false;
        if (Double.compare(car.engineVolume, engineVolume) != 0) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        return colorCar != null ? colorCar.equals(car.colorCar) : car.colorCar == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + yearOfManufacture;
        result = 31 * result + (colorCar != null ? colorCar.hashCode() : 0);
        temp = Double.doubleToLongBits(engineVolume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
