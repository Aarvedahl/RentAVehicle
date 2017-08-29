package io.github.aarvedahl;

public class RentAVehicle {

    public static void main(String[] args) {

        Booking theView = new Booking();

        VehicleController theController = new VehicleController(theView);

        theView.setVisible(true);

    }
}
