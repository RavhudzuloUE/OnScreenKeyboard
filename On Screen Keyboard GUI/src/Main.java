

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sub.ScreenKeyboardPane;

/**
 * 
 * @author Ravhudzulo Unarine Ernest
 * 
 * Main is a subClass of Application
 */
public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Instantiate the ScreenKeyboardPane
		ScreenKeyboardPane pane = new ScreenKeyboardPane();
		
		// Create a Scene for the layout
		Scene sc = new Scene(pane, 900, 580);    
		
		primaryStage.setTitle("ON SCREEN KEYBOARD");   // Set the Title
		primaryStage.setScene(sc);                     // Set the Scene
		primaryStage.show();                           // Show the Scene on the Stage

	}

	public static void main(String[] args) {
		
		launch(args);    // Launch the Application

	}

}
