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
			// Kolla vilken vehicle som ska hyras ut och s�tt available = false
			System.out.println("Rent Vehicle");
			
		}
		
	}
	
	class ReturnVehicleListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// Kolla vilken vehicle som ska l�mnas in och s�tt available = true
			System.out.println("Return Vehicle");
		}
		
	}
	


}
