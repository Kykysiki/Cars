package driver;

import transport.Cars;

public class CategoryB extends Driver<Cars> {


    public CategoryB(String fullName, String driverLicense, int experience, Cars cars) {
        super(fullName, "B", experience, cars);
    }
}
