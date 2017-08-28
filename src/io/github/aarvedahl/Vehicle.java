package io.github.aarvedahl;

public abstract class Vehicle {
	
	double speed;
	String brand;
	int price;
	boolean available;
	String color;
	
	
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
