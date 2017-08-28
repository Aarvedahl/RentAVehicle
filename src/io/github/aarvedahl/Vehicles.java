package io.github.aarvedahl;

import java.util.List;
import java.util.ArrayList;

public class Vehicles {

	List<Vehicle>allVehicle = new ArrayList<Vehicle>();
	List<Vehicle>availableVehicle = new ArrayList<Vehicle>();
	
	private void addToAvailableVehicles() {
		for(Vehicle v: allVehicle) {
			if(v.available == true) {
				availableVehicle.add(v);
			}
		}
	}
	
	public Vehicles() {
		addVehicles();
		addToAvailableVehicles();
	}
	
	private void addVehicles() {
		Vehicle car1 = new Car(200, "Volvo", 900, true);
		Vehicle car2 = new Car(250, "BMW", 1100, true);
		Vehicle bike1 = new Bike("BRONCO", 80, true);
		Vehicle bike2 = new Bike("Crescent", 100, true);
		addVehicle(car1);
		addVehicle(car2);
		addVehicle(bike1);
		addVehicle(bike2);
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
}

