package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class ViewController {

	@FXML
	private Button btTest;
	@FXML
	private Label lbTest;

	@FXML
	private CheckBox cbPHP;

	@FXML
	private CheckBox cbJava;

	@FXML
	public void onBtTestActon() {
		System.out.println("botao ativado");

		System.out.println(cbJava.selectedProperty().getValue());
		System.out.println(cbPHP.selectedProperty().getValue());
		if (cbJava.selectedProperty().getValue() == true && cbPHP.selectedProperty().getValue() == true) {
			lbTest.setText("Todos est�o ativado");
		}
		else if (cbPHP.selectedProperty().getValue() == true) {
			lbTest.setText("PHP est� ativado");
		} 
		else if (cbJava.selectedProperty().getValue() == true) {
			lbTest.setText("Java est� ativado");
		}		
		else {
			lbTest.setText("Todos itens est�o desativados");
		}
	}
}
