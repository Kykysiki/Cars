package transport;

public class Cars extends Transport implements Competing { // легковые автомобили

    private final int maxSpeed;
    private final int bestLapTime;
    private BodyType bodyType;

    public Cars(String brand, String model, int engineVolume, int maxSpeed, int bestLapTime, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.maxSpeed = Validation.defaultNum(maxSpeed);
        this.bestLapTime = Validation.defaultNum(bestLapTime);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void showType() {
        if (bodyType == null) {
            System.out.println("Данных недостаточно");
        } else System.out.println("Тип кузова авто: " + bodyType);
    }

    @Override
    public boolean service() {
        return Math.random() > 0.6;
    }

    @Override
    public void repear() {
        System.out.println("Машина "+getBrand()+" "+getModel()+" починена");
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
        System.out.println(getBrand() + " " + getModel() + " - приехала на пит-стоп, выполнили диагностику.");
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
        return "Легковой автомобиль - " + getBrand() + " " + getModel() + ", тип кузова - " + getBodyType().getType() + ", объем двигателя - " + getEngineVolume() + "л.";
    }
}
