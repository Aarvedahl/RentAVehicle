package io.github.aarvedahl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class VehicleController {
    private Vehicles vehicles = new Vehicles();
    private Booking theView;

    public VehicleController(Booking theView) {
        this.theView = theView;
        this.theView.addRentVehicleListener(new RentVehicleListener());
        this.theView.addReturnVehicleListener(new ReturnVehicleListener());
    }

    public VehicleController() {

    }

    public List<Vehicle> getAllVehicles() {
     //   vehicles.addToLists();
        return vehicles.getAllVehicle();
    }

    public Object[] addToVehicleList() {
        List <String> newList = new ArrayList<>();
        // Kolla om vår lista är tom och bara om den är tom så kan vi hämta och fylla på den
        vehicles.addToLists();
        for(Vehicle v: vehicles.getAvailableVehicle()) {
            newList.add(v.serialNumber + "");
        }
        return newList.toArray();
    }

    public Object[] unavailableVehicles() {
        List <String> list = new ArrayList<>();
        // Kolla om vår lista är tom och bara om den är tom så kan vi hämta och fylla på den
        vehicles.addToLists();
        for(Vehicle v: vehicles.getUnavailableVehicle()) {
            list.add(v.serialNumber + "");
        }
        return list.toArray();
    }

    class RentVehicleListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            //RentCarView rentCarView = new RentCarView();
            //RentCarController rentCarController = new RentCarController(rentCarView);
            //rentCarView.setVisible(true);
            vehicles.rentVehicle(theView.comboBox.getSelectedItem().toString());
            theView.setVehicles();
        }

    }

    class ReturnVehicleListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
           // ReturnCarView returnCarView = new ReturnCarView();
           // ReturnCarController returnCarController = new ReturnCarController(returnCarView);
           // returnCarView.setVisible(true);
            vehicles.returnVehicle(theView.unavailableComboBox.getSelectedItem().toString());
           // theView.setVehicles();
        }

    }



}
