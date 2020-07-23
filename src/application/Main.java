package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage palco) {          //criando o palco
		try {                                 //carregando a tela View em SeceneBuilder
			Parent parente = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			Scene cena = new Scene(parente);  // 
			palco.setScene(cena);             //     
			palco.show();                     //mostra a tela View no PC
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);    //inicia o JavaFX
	}
}
