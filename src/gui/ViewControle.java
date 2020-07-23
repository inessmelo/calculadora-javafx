package gui;

import gui.util.Alerta;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewControle {
	@FXML
	private TextField txtNum1;
	@FXML
	private TextField txtNum2;
	@FXML
	private Label lblResultado;
	@FXML
	private Button btnSoma;
	@FXML
	private Button btnSubtrai;
	@FXML
	private Button btnMultiplica;
	@FXML
	private Button btnDivide;

	@FXML
	public void onBtnSomaAction() {
		try {
			double num1 = Double.parseDouble(txtNum1.getText());
			double num2 = Double.parseDouble(txtNum2.getText());
			double soma = num1 + num2;
			lblResultado.setText(String.format("%.2f", soma));
		} catch (NumberFormatException e) {
			Alerta.showAlert("Erro", "Apenas número", e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	public void onBtnSubtraiAction() {
		try {
			double num1 = Double.parseDouble(txtNum1.getText());
			double num2 = Double.parseDouble(txtNum2.getText());
			double subtrai = num1 - num2;
			lblResultado.setText(String.format("%.2f", subtrai));
		} catch (NumberFormatException e) {
			Alerta.showAlert("Erro", "Apenas número", e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	public void onBtnMultiplicaAction() {
		try {
			double num1 = Double.parseDouble(txtNum1.getText());
			double num2 = Double.parseDouble(txtNum2.getText());
			double multiplica = num1 * num2;
			lblResultado.setText(String.format("%.2f", multiplica));
		} catch (NumberFormatException e) {
			Alerta.showAlert("Erro", "Apenas número", e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	public void onBtnDivideAction() {
		try {
			double num1 = Double.parseDouble(txtNum1.getText());
			double num2 = Double.parseDouble(txtNum2.getText());
			double divide = num1 / num2;
			lblResultado.setText(String.format("%.2f", divide));
		} catch (NumberFormatException e) {
			Alerta.showAlert("Erro", "Apenas número", e.getMessage(), AlertType.ERROR);
		}
	}

}
