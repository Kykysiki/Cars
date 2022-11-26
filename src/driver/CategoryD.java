package driver;

import transport.FreightCar;

public class CategoryD extends Driver<FreightCar> {

    public CategoryD(String fullName, String driverLicense, int experience, FreightCar cars) {
        super(fullName, "D", experience, cars);
    }
}
