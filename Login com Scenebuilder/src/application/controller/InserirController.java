package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class InserirController {

    @FXML
    private Button btInserir;

    @FXML
    private Label acAviso;

    @FXML
    void acBuscarTroca(ActionEvent event) {
    	Main.changeScreen("busca");
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
    void acInserir(ActionEvent event) {
    	acAviso.setText("Inserido com sucesso!");
    }
}
