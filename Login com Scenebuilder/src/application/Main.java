package application;
	


import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	private static Stage stage;
	private static Scene loginScene;
	private static Scene cadastroScene;
	private static Scene buscaScene;
	private static Scene inserirScene;
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		try {
			stage = primaryStage;
			primaryStage.setTitle("Sistema de Estoque");

	        Parent fxmlLogin = FXMLLoader.load((getClass().getResource("view/Login.fxml")));
	        loginScene = new Scene(fxmlLogin,600,400);
	        
	        Parent fxmlCadastro = FXMLLoader.load((getClass().getResource("view/Cadastro.fxml")));
	        cadastroScene = new Scene(fxmlCadastro,600,400);
	        
	        Parent fxmlBusca = FXMLLoader.load((getClass().getResource("view/Busca.fxml")));
	        buscaScene = new Scene(fxmlBusca,600,400);
	        
	        Parent fxmlInserir = FXMLLoader.load((getClass().getResource("view/Inserir.fxml")));
	        inserirScene = new Scene(fxmlInserir,600,400);
	        
	        primaryStage.setScene(loginScene);
	        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void changeScreen(String tela) {
		switch (tela) {
		case "login":
			stage.setScene(loginScene);
			break;
		case "cadastro":
			stage.setScene(cadastroScene);
			break;
		case "busca":
			stage.setScene(buscaScene);
			break;
		case "inserir":
			stage.setScene(inserirScene);
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
