package gui.viewsandcontrollers.calculadora;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CalculadoraController {

    @FXML
    private Label label;

    @FXML
    private TextField textfield;

    @FXML
    private void sumarButtonAction(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Calculadora.fxml"));
		int num1 = root.getChildrenUnmodifiable().get(0);
		int num2 = root.getChildrenUnmodifiable().get(1);

		label.setText(textfield.getText());
    }
    
    @FXML
    private void restarButtonAction(ActionEvent event) {
    	
    }
    
    @FXML
    private void multiplicarButtonAction(ActionEvent event) {
    	
    }
    
    @FXML
    private void dividirButtonAction(ActionEvent event) {
    	
    }
}
