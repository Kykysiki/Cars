package transport;

public class Bus extends Transport implements Competing { // автобусы
    private final int maxSpeed;
    private final int bestLapTime;
    private Capacity capacity;

    public Bus(String brand, String model, int engineVolume, int maxSpeed, int bestLapTime, Capacity capacity) {
        super(brand, model, engineVolume);
        this.maxSpeed = Validation.defaultNum(maxSpeed);
        this.bestLapTime = Validation.defaultNum(bestLapTime);
        this.capacity = capacity;
    }

    @Override
    public void showType() {
        if (capacity == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Вместимость автобуса: от " + capacity.getFrom() + " до " + capacity.getTo());
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется");
        return true;
    }

    @Override
    public void repear() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " починен");
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
        return "Автобус - " + getBrand() + " " + getModel() + ", вместимость: от " + capacity.getFrom() +
                " до " + capacity.getTo() + ", объем двигателя - " + getEngineVolume() + "л.";
    }
}
