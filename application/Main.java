package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

																					
public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try
		{
			primaryStage.setAlwaysOnTop(true);
			primaryStage.getIcons().add(new Image("/images/hangmanicon.png"));

			FXMLLoader root = new FXMLLoader(getClass().getResource("HangmanFile.fxml"));
		    Parent gameScenePane = root.load();
		    Scene gameScene = new Scene(gameScenePane);
		    
		    
	        HangmanController rootPaneController = (HangmanController) root.getController();
	        rootPaneController.setMainParent(gameScenePane);
	        

			gameScene.setFill(javafx.scene.paint.Color.CORAL);

			gameScenePane.requestFocus();

			primaryStage.setScene(gameScene);
			primaryStage.show();
  
	        
		}
		catch(IOException e)
		{
		}
	}

	public static void main(String[] args)
	{
		launch(args);
	}

	
}
