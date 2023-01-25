package driver;

public class DriverB extends Driver {

    public DriverB(String name,
                   boolean hasDriverLicence,
                   int experienceInYears) {
        super(name, hasDriverLicence, experienceInYears);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории B " + getName() + " начал движение");

    }

    @Override
    public void finischMove() {
        System.out.println("Водитель категории B " + getName() + " закончил движение");

    }

    @Override
    public void refill() {
        System.out.println("Водитель категории B " + getName() + " заправляет авто");

    }
}






