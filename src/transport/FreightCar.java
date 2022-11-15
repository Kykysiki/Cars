package transport;

public class FreightCar extends Transport implements Competing { // грузовые автомобили
    private final int maxSpeed;
    private final int bestLapTime;

    public FreightCar(String brand, String model, int engineVolume, int maxSpeed, int bestLapTime) {
        super(brand, model, engineVolume);
        this.maxSpeed = Validation.defaultNum(maxSpeed);
        this.bestLapTime = Validation.defaultNum(bestLapTime);
    }

    @Override
    public void startMoving() {
        System.out.println("Начинает заед.");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Заканчивает заед.");
    }

    @Override
    public void getPitStop() {
        System.out.println(getBrand() + " " + getModel() + " - приехал на пит-стоп, выполнили диагностику.");
    }

    @Override
    public int getBestLapTime() {
        return bestLapTime;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void result() {
        System.out.println("Максимальная скорость - " + getMaxSpeed() + " км/ч;" + " Лучшее время круга - " + getBestLapTime() + " мин.");
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль - " + getBrand() + " " + getModel() + ", объем двигателя - " + getEngineVolume() + "л.";
    }
}
