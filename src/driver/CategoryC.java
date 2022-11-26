package driver;

import transport.Bus;

public class CategoryC extends Driver<Bus> {

    public CategoryC(String fullName, String driverLicense, int experience, Bus cars) {
        super(fullName, "C", experience, cars);
    }
}
