package transport;

import driver.Driver;
import exception.DiagnosticFaildException;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public  abstract class Transport<T extends Driver> implements Competing {

    private String brand;
    private String model;
    private double engineVolume;
    private final T driver;
    private final Set<Mehanic> mehanics = new HashSet<>();


    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;


    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver) {

        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = brand;
        }
        setEngineVolume(engineVolume);


        this.driver = driver;

    }

    public abstract void startMove();

    public abstract void finischMove();

    public abstract void printType();

    public abstract boolean diagnostics() throws DiagnosticFaildException;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = DEFAULT_ENGINE_VOLUME;
        }
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public Set<Mehanic> getMehanics() {
        return mehanics;
    }

    public void addMechanic(Mehanic mehanic) {
        mehanics.add(mehanic);

    }

    @Override
    public String toString() {
        return "transport.Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public abstract void refill();

    public Transport(T driver) {
        this.driver = driver;
    }



    public abstract String name();

    public void maxSpeed() {
    }

    public void pitStop() {
    }

    public void theBestTimeLap() {
    }
}


