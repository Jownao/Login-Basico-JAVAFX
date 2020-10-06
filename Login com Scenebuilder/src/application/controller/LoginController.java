package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private Label acAviso;
    
    @FXML
    void acCadastroTroca(ActionEvent event) {
    	Main.changeScreen("cadastro");
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
    void acEntrar(ActionEvent event) {
    	System.out.println("Login de "+txtUsuario.getText()+" efetuado com sucesso!");
    	acAviso.setText("Logado com sucesso!");
    	
    }

}
