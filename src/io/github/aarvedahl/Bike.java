package io.github.aarvedahl;

public class Bike extends Vehicle {

	public Bike(String brand, int price, boolean available){
		this.brand = brand;
		this.price = price;
		this.available = available;
	}
	
	public void ride() {
		System.out.println("This " +  brand + " bike is going great");
	}
}
