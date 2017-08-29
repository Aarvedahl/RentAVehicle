package io.github.aarvedahl;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ReturnCarView extends JFrame {
    private JLabel text = new JLabel("Please choose a car to return");
    private JButton confirmBtn = new JButton("Confirm");
    private JButton cancelBtn = new JButton("Cancel");
    private JComboBox vehicleList;
    Vehicles vehicles = new Vehicles();

    public ReturnCarView() {
        JPanel returnPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(370, 170);

        vehicleList = new JComboBox(addToVehicleList());
        returnPanel.add(text);
        returnPanel.add(vehicleList);
        returnPanel.add(confirmBtn);
        returnPanel.add(cancelBtn);

        this.add(returnPanel);
    }

    public Object getSelectedVehicle() {
        return vehicleList.getSelectedItem();
    }

    private Object[] addToVehicleList() {
        List <String> vehiclesNames = new ArrayList<>();

        for(Vehicle v: vehicles.getUnavailableVehicle()) {
            vehiclesNames.add(v.model + " ," + v.price + " kr");
        }
        return  vehiclesNames.toArray();
    }

    void addConfirmReturnListener(ActionListener listenForConfirmButton) {
        confirmBtn.addActionListener(listenForConfirmButton);
    }

    void addCancelReturnListener(ActionListener listenForCancelButton) {
        cancelBtn.addActionListener(listenForCancelButton);
    }


}
