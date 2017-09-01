package io.github.aarvedahl;

import java.awt.event.ActionListener;
import javax.swing.*;

public class Booking extends JFrame {
    private JButton rentButton = new JButton("Rent Vehice");
    private JButton returnButton = new JButton("Return Vehice");
    private JTextArea showVehicles = new JTextArea(25, 25);
    private VehicleController controller = new VehicleController();
    public JComboBox comboBox;
    public JComboBox unavailableComboBox;

    public Booking() {
        JPanel vehiclePanel = new JPanel();
        showVehicles.setEditable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(650, 400);
        comboBox = new JComboBox(controller.addToVehicleList());
        unavailableComboBox = new JComboBox(controller.unavailableVehicles());


        vehiclePanel.add(showVehicles);
        vehiclePanel.add(comboBox);
        vehiclePanel.add(rentButton);
        vehiclePanel.add(unavailableComboBox);
        vehiclePanel.add(returnButton);
        setVehicles();

        this.add(vehiclePanel);
    }

    public void setVehicles() {
        showVehicles.setText(null);
        showVehicles.append("Model:     SerialNumber:   Price:  Available \n");
        for(Vehicle v: controller.getAllVehicles()) {
            showVehicles.append(v.model + ",        " + v.serialNumber + ",             "  + v.price + "kr,        " + v.available +"\n");
        }
    }

    public void refreshComboBox() {
        comboBox.removeAllItems();
        unavailableComboBox.removeAllItems();
        for(Object o: controller.addToVehicleList()) {
            comboBox.addItem(o);
        }
        for(Object o: controller.unavailableVehicles()) {
            unavailableComboBox.addItem(o);
        }
    }


    void addRentVehicleListener(ActionListener listenForRentButton) {
        rentButton.addActionListener(listenForRentButton);
    }

    void addReturnVehicleListener(ActionListener listenForReturnButton) {
        returnButton.addActionListener(listenForReturnButton);
    }

}
