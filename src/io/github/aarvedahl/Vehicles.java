package io.github.aarvedahl;

import java.util.List;
import java.util.ArrayList;

public class Vehicles {
    static List<Vehicle>allVehicle = new ArrayList<Vehicle>();
    // TODO Fixa så allVehicle inte är statiskt

    public Vehicles() {
    }

    public void addToLists() {
        addVehicles();
    }

    private void addVehicles() {
        Vehicle car1 = new Car(200, "Volvo XC90", 900, true, 004);
        Vehicle car2 = new Car(250, "BMW 428", 1100, false, 003);
        Vehicle bike1 = new Bike("BRONCO", 80, true, 001);
        Vehicle bike2 = new Bike("Crescent", 100, true, 002);
        addVehicle(car1);
        addVehicle(car2);
        addVehicle(bike1);
        addVehicle(bike2);
    }

    public void rentVehicle(String serialNumber) {
        for(Vehicle vehicle: getAllVehicles()) {
           if (vehicle.serialNumber == Integer.parseInt(serialNumber)) {
                vehicle.available = false;
            }
        }
    }

    public void returnVehicle(String serialNumber) {
        for(Vehicle vehicle: getAllVehicles()) {
            if (vehicle.serialNumber == Integer.parseInt(serialNumber)) {
                vehicle.available = true;
            }
        }
    }

    public void addVehicle(Vehicle vehicle) {
        allVehicle.add(vehicle);
    }

    public int numberOfAvaiableVehicles() {
        return allVehicle.size();
    }

    public List<Vehicle> getAllVehicles() {
        return allVehicle;
    }

}

