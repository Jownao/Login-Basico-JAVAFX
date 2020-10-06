package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BuscaController implements Initializable{
    @FXML
    private Label acAviso;
    @FXML
    private TextField txtUsuario;

    @FXML
    private ComboBox<String> comboField;
    
    ObservableList<String> list = FXCollections.observableArrayList("Internacional","Nacional");
    
    @FXML
    void acBox(ActionEvent event) {
    	
    }
    
    @FXML
    void acCadastroTroca(ActionEvent event) {
    	Main.changeScreen("cadastro");
    }

    @FXML
    void acLoginTroca(ActionEvent event) {
    	Main.changeScreen("login");
    }

    @FXML
    void acInserirTroca(ActionEvent event) {
    	Main.changeScreen("inserir");
    }

    @FXML
    void acBuscar(ActionEvent event) {
    	acAviso.setText("Procurando...");
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		comboField.setItems(list);
		
	}

}
