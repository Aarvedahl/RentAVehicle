package io.github.aarvedahl;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class RentCarView extends JFrame {
    private JLabel text = new JLabel("Please choose a car to rent:");
    private JButton confirmBtn = new JButton("Confirm");
    private JButton cancelBtn = new JButton("Cancel");
    Vehicles vehicles = new Vehicles();
    private JComboBox vehicleList;


    public RentCarView() {
        JPanel rentPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(370, 170);

        vehicleList = new JComboBox(addToVehicleList());
        rentPanel.add(text);
        rentPanel.add(vehicleList);
        rentPanel.add(confirmBtn);
        rentPanel.add(cancelBtn);

        this.add(rentPanel);

    }

    public Object getSelectedVehicle() {
        return vehicleList.getSelectedItem();
    }

    private Object[] addToVehicleList() {
        List <String> newList = new ArrayList<>();

        for(Vehicle v: vehicles.getAvailableVehicle()) {
            newList.add(v.model + ", " + v.serialNumber + ", " + v.price + " kr");
        }
        return newList.toArray();
    }

    void addConfirmRentListener(ActionListener listenForConfirmButton) {
        confirmBtn.addActionListener(listenForConfirmButton);
    }

    void addCancelRentListener(ActionListener listenForCancelButton) {
        cancelBtn.addActionListener(listenForCancelButton);
    }
}
