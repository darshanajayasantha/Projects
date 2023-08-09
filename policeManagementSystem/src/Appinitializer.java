import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Appinitializer extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource=getClass().getResource("view/criminal_window_form.fxml");
        Parent root= FXMLLoader.load(resource);
        Scene scene=new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Criminal Search");
        primaryStage.centerOnScreen();
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
