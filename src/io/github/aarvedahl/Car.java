package io.github.aarvedahl;

public class Car extends Vehicle {

	private int numberOfSeats;
	private String registrationNumber;
	
	public Car(double speed, String brand, int price, boolean available){
		this.speed = speed;
		this.brand = brand;
		this.price = price;
		this.available = available;
	}
	
	public void drive() {
		System.out.println("This " + brand + " car is going amazing");
	}
}
