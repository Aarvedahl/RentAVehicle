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

