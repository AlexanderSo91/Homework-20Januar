package driver;

public abstract class Driver {

    private String name;
    private boolean hasDriverLicence;
    private int experienceInYears;
    private int driversLicenseType;

    public Driver(String name, boolean hasDriverLicence, int experienceInYears, int driversLicenseType) {
        this.name = name;
        this.hasDriverLicence = hasDriverLicence;
        this.experienceInYears = experienceInYears;
        this.driversLicenseType = driversLicenseType;
    }

    public Driver(String name, boolean hasDriverLicence, int experienceInYears) {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriverLicence() {
        return hasDriverLicence;
    }

    public void setHasDriverLicence(boolean hasDriverLicence) {
        this.hasDriverLicence = hasDriverLicence;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public int getDriversLicenseType() {
        return driversLicenseType;
    }

    public void setDriversLicenseType(int driversLicenseType) {
        this.driversLicenseType = driversLicenseType;
    }

    public abstract void startMove();

    public abstract void finischMove();

    public abstract void refill();

    @Override
    public String toString() {
        return "Водитель " + name;
    }
}





