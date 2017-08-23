package io.github.aarvedahl;

public abstract class Vehicle {
	
	double speed;
	String brand;
	int price;
	boolean available;
	String color;
	
	/**
	 * Takes a vehicle and returns true or false depending if it was successful
 	 * @param vehicle -  The vehicle the customer want to rent
	 * @return true or false depending if it was successful or not
	 */
	public boolean rentVehicle() {
		if(available == true) {
			available = false;
			return true;
		} else {
			return false;
		}
	}
	
	public void returnVehicle() {
		available = true;
	}

}
