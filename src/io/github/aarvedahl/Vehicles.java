package io.github.aarvedahl;

import java.util.List;
import java.util.ArrayList;

public class Vehicles {

    List<Vehicle>allVehicle = new ArrayList<Vehicle>();
    List<Vehicle>availableVehicle = new ArrayList<Vehicle>();
    List<Vehicle>unavailableVehicle = new ArrayList<Vehicle>();

    private void addToAvailableVehicles() {
        for(Vehicle v: allVehicle) {
            if(v.available == true) {
                availableVehicle.add(v);
            } else {
                unavailableVehicle.add(v);
            }
        }
    }

    public Vehicles() {
        addVehicles();
        addToAvailableVehicles();
    }

    private void addVehicles() {
        Vehicle car1 = new Car(200, "Volvo XC90", 900, true, 004);
        Vehicle car2 = new Car(250, "BMW 428", 1100, true, 003);
        Vehicle bike1 = new Bike("BRONCO", 80, true, 001);
        Vehicle bike2 = new Bike("Crescent", 100, true, 002);
        addVehicle(car1);
        addVehicle(car2);
        addVehicle(bike1);
        addVehicle(bike2);
    }

    public void rentVehicle(Vehicle v) {
        for(Vehicle vehicle: getAllVehicle()) {
            if(vehicle.serialNumber == v.serialNumber) {
                v.available = false;
            }
        }
    }

    public void returnVehicle(Vehicle v) {
        for(Vehicle vehicle: getAllVehicle()) {
            if(vehicle.serialNumber == v.serialNumber) {
                v.available = true;
            }
        }
    }

    public void addVehicle(Vehicle vehicle) {
        allVehicle.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        allVehicle.remove(vehicle);
    }

    public int numberOfAvaiableVehicles() {
        return availableVehicle.size();
    }

    public List<Vehicle> getAllVehicle() {
        return allVehicle;
    }

    public List<Vehicle> getAvailableVehicle() {
        return availableVehicle;
    }

    public List<Vehicle> getUnavailableVehicle() {
        return unavailableVehicle;
    }
}

