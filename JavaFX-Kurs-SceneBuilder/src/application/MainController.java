package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
		
	@FXML
	private Label myLabel;

	public void setLabel(ActionEvent event) {
		myLabel.setText("Hallo wie gehts?");
	}
}
