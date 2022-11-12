package transport;

import driver.Driver;
import utility.Utility;

import java.util.*;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;

    private Set<Driver<?>> driverList = new HashSet<>();
    private Set<Mechanic<?>> mechanicList = new HashSet<>();
    private Set<Sponsor> sponsorList = new HashSet<>();

    public Transport(String brand, String model, double engineVolume) {
        this.brand = Utility.checkNull(brand ,"Default");
        this.model = Utility.checkNull(model,"Default");
        this.engineVolume = Utility.checkDouble(engineVolume,1.5);
    }

    public void addDriver(Driver<?>... drivers) {
        this.driverList.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanicList.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsorList.addAll(Arrays.asList(sponsors));
    }

    public Set<Driver<?>> getDriverList() {
        return driverList;
    }

    public Set<Mechanic<?>> getMechanicList() {
        return mechanicList;
    }

    public Set<Sponsor> getSponsorList() {
        return sponsorList;
    }

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
        this.engineVolume = Utility.checkDouble(engineVolume, 1.5);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    public abstract void startMoving();
    public abstract void finishTheMovement();
    public abstract boolean passDiagnostics();
    public abstract void repair();
}