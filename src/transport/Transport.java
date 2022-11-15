package transport;

public abstract class Transport {
    private final String brand; // марка

    private final String model; // модель

    private final int engineVolume; // объем двигателя

    public Transport(String brand, String model, int engineVolume) {
        this.brand = Validation.validDefault(brand, "Не указана");
        this.model = Validation.validDefault(model, "Не указана");
        this.engineVolume = Validation.defaultNum(engineVolume);
    }

    public abstract void startMoving();

    public abstract void finishTheMove();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getEngineVolume() {
        return engineVolume;
    }
}
