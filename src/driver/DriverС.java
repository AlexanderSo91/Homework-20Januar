package driver;

public class DriverС extends Driver {

    public DriverС(String name,
                   boolean hasDriverLicence,
                   int experienceInYears) {
        super(name, hasDriverLicence, experienceInYears);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории C " + getName() + " начал движение");

    }

    @Override
    public void finischMove() {
        System.out.println("Водитель категории C " + getName() + " закончил движение");

    }

    @Override
    public void refill() {
        System.out.println("Водитель категории C " + getName() + " заправляет авто");

    }
}








