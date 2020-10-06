package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CadastroController {
    @FXML
    private Label acAviso;

    @FXML
    void acLoginTroca(ActionEvent event) {
    	Main.changeScreen("login");
    }
    @FXML
    void acBuscarTroca(ActionEvent event) {
    	Main.changeScreen("busca");
    }

    @FXML
    void acInserirTroca(ActionEvent event) {
    	Main.changeScreen("inserir");
    }
    
    @FXML
    void acCadastrar(ActionEvent event) {
    	acAviso.setText("Cadastrado com sucesso!");
    }
	
}
