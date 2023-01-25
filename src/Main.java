import driver.Driver;
import driver.DriverB;
import driver.DriverD;
import driver.DriverС;
import exception.DiagnosticFaildException;
import transport.Mehanic;
import transport.STO;
import transport.Transport;
import transport.TransportType;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Водитель категории B", true, 1);
        DriverС driverC = new DriverС("Водитель категории C", true, 3);
        DriverD driverD = new DriverD("Водитель категории D", true, 2);


        Car car = new Car("BMW", "3", 1.6, driverB);
        Bus bus = new Bus("Iveco", "1345", 2.5, driverD);
        Truck truck = new Truck("Volvo", "Go", 3.0, driverC);


        try {
            System.out.println(car.diagnostics());
        } catch (DiagnosticFaildException e) {
            e.printStackTrace();
        }

        List<Driver> drivers = new ArrayList<>();
        drivers.add(driverB);
        drivers.add(driverC);
        drivers.add(driverD);


        Mehanic mehanic1 = new Mehanic("Sodov Alex", "Michelin", TransportType.ALL);
        Mehanic mehanic2 = new Mehanic("Sidorov Mihail", "Michelin", TransportType.ALL);
        Mehanic mehanic3 = new Mehanic("Nodo Alexey", "Michelin", TransportType.ALL);

        car.addMechanic(mehanic1);
        car.addMechanic(mehanic1);
        car.addMechanic(mehanic2);

        bus.addMechanic(mehanic3);

        truck.addMechanic(mehanic1);
        truck.addMechanic(mehanic2);
        truck.addMechanic(mehanic3);

        List<Transport<?>> racers = new ArrayList<>();

        racers.add(car);
        racers.add(bus);
        racers.add(truck);

        Map<Transport<?>, Mehanic> transportMechanicMap = new HashMap<>();

        for (Transport<?> racer : racers) {
            Set <Mehanic> mehanics = racer.getMehanics();

            while (mehanics.iterator().hasNext()) {
                transportMechanicMap.put(racer, mehanics.iterator().next());
            }
        }

        for (Transport<?> transport : racers) {
            System.out.println(transport + " " + transport.getDriver() + " " + transport.getMehanics());
        }

        STO sto = new STO();
        sto.addTransport(car);
        sto.addTransport(bus);
        sto.addTransport(truck);

        sto.runTO();
        sto.runTO();
        sto.runTO();

    }
    private static void printInfo(Transport<?> transport) {
        transport.maxSpeed();
        transport.pitStop();
        transport.theBestTimeLap();

        System.out.println(" " + transport.getDriver() + " управляет автомобилем "
                + transport.getBrand() + " " + transport.getModel() + " обьемом " + transport.getEngineVolume() + " и будет учавствовать в заезде");

    }
}
