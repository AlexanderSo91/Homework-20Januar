package driver;

public class DriverD extends Driver {

    public DriverD(String name,
                   boolean hasDriverLicence,
                   int experienceInYears) {
        super(name, hasDriverLicence, experienceInYears);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории D " + getName() + " начал движение");

    }

    @Override
    public void finischMove() {
        System.out.println("Водитель категории D " + getName() + " закончил движение");

    }

    @Override
    public void refill() {
        System.out.println("Водитель категории D " + getName() + " заправляет авто");

    }
}







