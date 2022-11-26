package transport;

import driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private final String brand; // марка

    private final String model; // модель

    private final int engineVolume; // объем двигателя

    private List<Driver<?>> drivers = new ArrayList<>();
    private List<Mechanic<?>> mechanics = new ArrayList<>();
    private List<Sponsor> sponsors = new ArrayList<>();


    public Transport(String brand, String model, int engineVolume) {
        this.brand = Validation.validDefault(brand, "Не указана");
        this.model = Validation.validDefault(model, "Не указана");
        this.engineVolume = Validation.defaultNum(engineVolume);
    }

    public void addDriver(Driver<?> drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor...sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void startMoving();

    public abstract void finishTheMove();

    public abstract void showType();

    public abstract boolean service();
    public abstract void repear();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }
}
