package io.github.aarvedahl;

public class Bike extends Vehicle {

    public Bike(String model, int price, boolean available, int serialNumber){
        this.model = model;
        this.price = price;
        this.available = available;
        this.serialNumber = serialNumber;
    }

    public void ride() {
        System.out.println("This " + model + " bike is going great");
    }
}
