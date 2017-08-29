package io.github.aarvedahl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RentCarController {
    private RentCarView rentCarView;
    private Vehicles vehicles = new Vehicles();

    public RentCarController(RentCarView rentCarView) {
        this.rentCarView = rentCarView;
        this.rentCarView.addConfirmRentListener(new ConfirmRentListener());
        this.rentCarView.addCancelRentListener(new CancelRentListener());
    }

    class ConfirmRentListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String[] parts = rentCarView.getSelectedVehicle().toString().split(", ");
            vehicles.rentVehicle(parts[1]);
            rentCarView.dispose();
        }

    }

    class CancelRentListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            rentCarView.dispose();
        }
    }
}
