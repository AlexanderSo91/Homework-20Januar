import driver.DriverB;
import exception.DiagnosticFaildException;

public class Car extends Transport<DriverB> {

    public Car(String brand,
               String model,
               double engineVolume,
               DriverB driverB) {
        super(brand, model, engineVolume, driverB);

    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль марки" + getBrand() + "начал движение");

    }

    @Override
    public void finischMove() {
        System.out.println("Автомобиль марки" + getBrand() + "закончил движение");


    }

    @Override
    public void printType() {

    }

    @Override
    public boolean diagnostics() throws DiagnosticFaildException {
        if (getDriver() != null && getDriver().isHasDriverLicence()) {
            return true;
        } else {
            throw new DiagnosticFaildException();
        }
    }
    @Override
    public void refill() {

    }

    @Override
    public void pitStop() {
        System.out.println("Питстоп");
    }


    @Override
    public void theBestTimeLap() {
        int minBound = 100;
        int maxBound = 200;
        int theBestTimeLap = (int) (minBound + (maxBound - minBound) * Math.random());

        System.out.println("Лучшее время круга автомобиля" + theBestTimeLap);

    }

    @Override
    public void maxSpeed() {
        int minBound = 150;
        int maxBound = 200;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());

        System.out.println("Максимальная скорость автомобиля" + maxSpeed);

    }
    @Override
    public String name() {
        return null;
    }
}




