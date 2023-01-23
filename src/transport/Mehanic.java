package transport;

public class Mehanic {
    private String name;
    private String company;
    private TransportType transportType;

    public Mehanic(String name, String company, TransportType transportType) {
        this.name = name;
        this.company = company;
        this.transportType = transportType;
    }

    public void maintenance() {
        System.out.println(name + " из компании" + company + " проводит техобслуживание");
    }

    public void fixing() {
        System.out.println(name + " из компании" + company + " чинит автомобиль");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    @Override
    public String toString() {
        return "Механик " + name + " из компании " + company;
    }
}
