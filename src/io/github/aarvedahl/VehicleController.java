package io.github.aarvedahl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VehicleController {
    private Vehicles vehicles = new Vehicles();
    private Booking theView;

    public VehicleController(Booking theView) {
        this.theView = theView;
        this.theView.addRentVehicleListener(new RentVehicleListener());
        this.theView.addReturnVehicleListener(new ReturnVehicleListener());

    }

    class RentVehicleListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            RentCarView rentCarView = new RentCarView();
            RentCarController rentCarController = new RentCarController(rentCarView);
            rentCarView.setVisible(true);

        }

    }

    class ReturnVehicleListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //  TODO Öppna en ny view
            //  TODO Kolla vilken vehicle som ska lämnas in och sätt available = true
            ReturnCarView returnCarView = new ReturnCarView();
            ReturnCarController returnCarController = new ReturnCarController();
            returnCarView.setVisible(true);
        }

    }



}
