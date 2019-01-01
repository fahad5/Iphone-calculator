package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.*;




public class Main extends Application {
	private Stage primaryStage ;
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage ;
		mainWindow();
		//primaryStage.show();
	}
	public void mainWindow() {
		try {
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainWindowView.fxml"));
		AnchorPane pane = loader.load();
		Scene scene = new Scene(pane);
		 MainWindowController controller = loader.getController();
		 controller.setMain(this);	
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("Calculator");
		
		}
		catch (Exception e) {
			
		}
	   
				
				
		
		
		 

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
