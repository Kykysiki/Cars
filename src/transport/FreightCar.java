package transport;

public class FreightCar extends Transport implements Competing { // грузовые автомобили
    private final int maxSpeed;
    private final int bestLapTime;
    private LoadCapacity loadCapacity;

    public FreightCar(String brand, String model, int engineVolume, int maxSpeed, int bestLapTime, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.maxSpeed = Validation.defaultNum(maxSpeed);
        this.bestLapTime = Validation.defaultNum(bestLapTime);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void showType() {
        if (loadCapacity == null) {
            System.out.println("Данных недостаточно");
        } else {
            String from = loadCapacity.getFrom() == null ? "" : "от " + loadCapacity.getFrom() + " ";
            String to = loadCapacity.getTo() == null ? "" : "до " + loadCapacity.getTo();
            System.out.println("Грузоподъемность авто: " + loadCapacity);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.765;
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
        return "Грузовой автомобиль - " + getBrand() + " " + getModel() + ", грузоподъемность: от " + loadCapacity.getFrom() + " до " + loadCapacity.getTo() + ", объем двигателя - " + getEngineVolume() + "л.";
    }
}
