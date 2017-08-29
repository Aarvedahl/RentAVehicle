package io.github.aarvedahl;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class RentCarView extends JFrame {
    private JLabel text = new JLabel("Please choose a car to rent:");
    // EN COMBOBOX SELECT
    // Ta emot en lista med alla available vehicles
    private JButton confirmBtn = new JButton("Confirm");
    private JButton cancelBtn = new JButton("Cancel");
    Vehicles vehicles = new Vehicles();

  /*  public static void main(String[] args) {
        RentCarView rent = new RentCarView();
    } */

    public RentCarView() {
        JPanel rentPanel = new JPanel();
        // list = vehicles.getAvailableVehicle();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(370, 170);

        JComboBox vehicleList = new JComboBox(addToVehicleList());
        rentPanel.add(text);
        rentPanel.add(vehicleList);
        rentPanel.add(confirmBtn);
        rentPanel.add(cancelBtn);

        this.add(rentPanel);

        //this.setVisible(true);
        // TODO finish RentCarView and add a combobox select

    }

    private Object[] addToVehicleList() {
        List <String> newList = new ArrayList<>();

        for(Vehicle v: vehicles.getAvailableVehicle()) {
            newList.add(v.model + " ," + v.price + " kr");
        }
        return newList.toArray();
    }

    void addConfirmButtonListener(ActionListener listenForConfirmButton) {
        confirmBtn.addActionListener(listenForConfirmButton);
    }

    void addCancelButtonListener(ActionListener listenForCancelButton) {
        cancelBtn.addActionListener(listenForCancelButton);
    }
}
