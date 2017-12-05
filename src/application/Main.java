package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application  {
	
	private AnchorPane mypane;
	@FXML
	private ImageView refugees;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		cargado();
		primaryStage.setScene(new Scene(mypane));
		primaryStage.show();
		
	}
	
	public void cargado() {
		
		try {
			
			FXMLLoader loader = new FXMLLoader(
		            getClass().getResource("vista.fxml"));
			mypane = (AnchorPane) loader.load();
			
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(mypane);


//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	@FXML
    private void crearVentana() {
    	showSendProfile();
    }
	
	@FXML
    private void cerrarVentana() {
		System.exit(0);
    }
	
	public void showSendProfile() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("ventanaimagen.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Superheader");
            
            //clips
           
            refugees = new ImageView();
            
            Scene scene = new Scene(page);
             sendStage.setScene(scene);

            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
