import driver.CategoryB;
import driver.CategoryC;
import driver.CategoryD;
import transport.*;

public class Main {
    public static void main(String[] args) {
        Cars bmw = new Cars("BMW", "i5", 3, 124, 3,BodyType.SEDAN);
        FreightCar mercedes = new FreightCar("Mercedes benz", "sprinter", 3, 76, 6,LoadCapacity.N2);
        Bus baw = new Bus("BAW", "Fenix", 3, 90, 5,Capacity.BIG);
        CategoryB viktor = new CategoryB("Виктор Иванович", "B", 4, bmw);
        System.out.println(viktor);
        System.out.println(bmw);
        bmw.startMoving();
        bmw.getPitStop();
        bmw.finishTheMove();
        bmw.result();
        System.out.println("");
        CategoryD andre = new CategoryD("Андрей Романович", "D", 6, mercedes);
        System.out.println(andre);
        System.out.println(mercedes);
        mercedes.startMoving();
        mercedes.getPitStop();
        mercedes.finishTheMove();
        mercedes.result();
        System.out.println("");
        CategoryC alex = new CategoryC("Александр Николаевич", "D", 3, baw);
        System.out.println(alex);
        System.out.println(baw);
        baw.startMoving();
        baw.getPitStop();
        baw.finishTheMove();
        baw.result();
    }
}