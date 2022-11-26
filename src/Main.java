import driver.CategoryB;
import driver.CategoryC;
import driver.CategoryD;
import driver.Driver;
import transport.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mechanic<Cars> ivan = new Mechanic<Cars>("Иван", "Дрыга", "Mинс");
        Sponsor okko = new Sponsor("Okko", 1_500_000);
        Cars bmw = new Cars("BMW", "i5", 3, 124, 3, BodyType.SEDAN);
        bmw.addDriver(new CategoryB("Виктор Иванович", "B", 4, bmw));
        bmw.addMechanic(ivan);
        bmw.addSponsor(okko);
        System.out.println("");
        Mechanic<FreightCar> anna = new Mechanic<FreightCar>("Анна", "Шульман", "Север");
        Sponsor beel = new Sponsor("Бил", 900_000);
        FreightCar mercedes = new FreightCar("Mercedes benz", "sprinter", 3, 76, 6, LoadCapacity.N2);
        mercedes.addDriver(new CategoryD("Андрей Романович", "D", 6, mercedes));
        mercedes.addMechanic(anna);
        mercedes.addSponsor(beel);
        System.out.println("");
        Mechanic<Bus> andre = new Mechanic<Bus>("Андре", "Турин", "Волтер");
        Sponsor yandex = new Sponsor("Яндекс", 2_500_000);
        Bus baw = new Bus("BAW", "Fenix", 3, 90, 5, Capacity.BIG);
        baw.addDriver(new CategoryC("Александр Николаевич", "D", 3, baw));
        baw.addMechanic(andre);
        baw.addSponsor(yandex);
        System.out.println("");
        List<Transport> transports = List.of(bmw, mercedes, baw);
        for (Transport transport : transports) {
            printInfo(transport);
        }
    }

    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю " + transport.getBrand() + " " + transport.getModel());
        System.out.printf("Водители: ");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getFullName());
        }
        System.out.printf("Спонсоры: ");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getName());
        }
        System.out.printf("Механики: ");
        for (Mechanic<?> mechanic : transport.getMechanics()) {
            System.out.println(mechanic.getName() + " " + mechanic.getSurname() + " из " + mechanic.getCompany());
        }
        System.out.println();
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + transport.getModel() + " не прошёл диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}