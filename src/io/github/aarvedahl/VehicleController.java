package io.github.aarvedahl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class VehicleController {
    Vehicles vehicles;
    private Booking theView;
    public VehicleController(Booking theView) {
        this.theView = theView;
        this.theView.addRentVehicleListener(new RentVehicleListener());
        this.theView.addReturnVehicleListener(new ReturnVehicleListener());
        vehicles = new Vehicles();
    }

    public VehicleController() {

        vehicles = new Vehicles();
    }

    public List<Vehicle> getAllVehicles() {
        return vehicles.getAllVehicles();
    }

    public Object[] addToVehicleList() {
        List <String> newList = new ArrayList<>();
        if(vehicles.getAllVehicles().size() == 0) {
            vehicles.addToLists();
        }
        for(Vehicle v: vehicles.getAllVehicles()) {
            if(v.available) {
                newList.add(v.serialNumber + "");
            }
        }
        return newList.toArray();
    }

    public Object[] unavailableVehicles() {
        List <String> list = new ArrayList<>();
        if(vehicles.getAllVehicles().size() == 0) {
            vehicles.addToLists();
        }
        for(Vehicle v: vehicles.getAllVehicles()) {
            if(!v.available) {
                list.add(v.serialNumber + "");
            }
        }
        return list.toArray();
    }

    class RentVehicleListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            vehicles.rentVehicle(theView.comboBox.getSelectedItem().toString());
            theView.setVehicles();
            theView.refreshComboBox();
        }

    }

    class ReturnVehicleListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            vehicles.returnVehicle(theView.unavailableComboBox.getSelectedItem().toString());
            theView.setVehicles();
            theView.refreshComboBox();
        }

    }



}
