import driver.DriverD;
import exception.DiagnosticFaildException;
import transport.Transport;


public class Bus extends Transport<DriverD> {

    public Bus(String brand,
               String model,
               double engineVolume,
               DriverD driverD) {
        super(brand, model, engineVolume, driverD);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус марки" + getBrand() + "начал движение");

    }

    @Override
    public void finischMove() {
        System.out.println("Автобус марки" + getBrand() + "закончил движение");

    }

    @Override
    public void printType() {

    }

    @Override
    public boolean diagnostics() throws DiagnosticFaildException {
        return false;
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
        int maxBound = 150;
        int theBestTimeLap = (int) (minBound + (maxBound - minBound) * Math.random());

        System.out.println("Лучшее время круга автобуса" + theBestTimeLap);

    }

    @Override
    public void maxSpeed() {
        int minBound = 40;
        int maxBound = 90;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());

        System.out.println("Максимальная скорость автобуса" + maxSpeed);

    }
    @Override
    public String name() {
        return null;
    }
}







