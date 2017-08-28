package io.github.aarvedahl;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Booking extends JFrame {
	private JButton rentButton = new JButton("Rent Vehice");
	private JButton returnButton = new JButton("Return Vehice");
	private JTextArea showVehicles = new JTextArea(15, 20);
	private JButton addButton = new JButton("Add Vehice");
	private JButton deleteButton = new JButton("Delete Vehice");
	private Object [] options = {"Confirm", "Cancel"};

	public Booking() {
	      JPanel vehiclePanel = new JPanel();
	      
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      this.setSize(400, 400);
	      
	      vehiclePanel.add(showVehicles);
	      vehiclePanel.add(rentButton);
	      vehiclePanel.add(returnButton);
	      vehiclePanel.add(addButton);
	      vehiclePanel.add(deleteButton);
	      
	      this.add(vehiclePanel);
	}
		
	public void setVehicles(List<Vehicles> list) {
		
	}
	
	void addRentVehicleListener(ActionListener listenForRentButton) {
		rentButton.addActionListener(listenForRentButton);
	}
	
	void addReturnVehicleListener(ActionListener listenForReturnButton) {
		returnButton.addActionListener(listenForReturnButton);
	} 
	
}
