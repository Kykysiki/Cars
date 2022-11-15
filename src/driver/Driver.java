package driver;

import transport.Cars;
import transport.Transport;
import transport.Validation;

public abstract class Driver<T extends Transport> {
    private final String fullName; // ФИО
    private final String driverLicense; // Категория прав
    private final int experience; // Стаж
    private final T cars;

    public Driver(String fullName, String driverLicense, int experience, T cars) {
        this.fullName = Validation.validDefault(fullName, "Не указано");
        this.driverLicense = Validation.validDefault(driverLicense, " Не указано");
        this.experience = Validation.defaultNum(experience);
        this.cars = cars;
    }

    public void startMoving() {
        System.out.println("Водитель " + this.fullName + " начал движение");
    }

    public void stay() {
        System.out.println("Водитель " + this.fullName + " закончил движение");
    }

    public void refuelTheCar(Cars cars) {
        System.out.println("Водитель " + this.fullName + " заправил " + cars.getBrand() + " " + cars.getModel());
    }

    public String getFullName() {
        return fullName;
    }

    public String isDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Водитель - " + this.fullName + " управляет автомобилем " + cars.getBrand() + " " + cars.getModel() + " и будет участвовать в заезде";
    }
}
