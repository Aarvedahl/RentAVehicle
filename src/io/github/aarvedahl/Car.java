package io.github.aarvedahl;

public class Car extends Vehicle {

    private int numberOfSeats;

    public Car(double speed, String model, int price, boolean available, int serialNumber){
        this.speed = speed;
        this.model = model;
        this.price = price;
        this.available = available;
        this.serialNumber = serialNumber;
    }

    public void drive() {
        System.out.println("This " + model + " car is going amazing");
    }
}
