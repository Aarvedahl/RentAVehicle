package io.github.aarvedahl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReturnCarController {
    private ReturnCarView returnCarView;
    private Vehicles vehicles = new Vehicles();

    public ReturnCarController(ReturnCarView returnCarView) {
        this.returnCarView = returnCarView;
        this.returnCarView.addConfirmReturnListener(new ConfirmReturnListener());
        this.returnCarView.addCancelReturnListener(new CancelReturnListener());
    }

    class ConfirmReturnListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String[] parts = returnCarView.getSelectedVehicle().toString().split(", ");
            vehicles.returnVehicle(parts[1]);
            returnCarView.dispose();
        }
    }

    class CancelReturnListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            returnCarView.dispose();
        }
    }
}
