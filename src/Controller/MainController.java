package Controller;

import Model.SoftwareSpecifications;
import Model.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Created by Nadin on 11/11/15.
 */
public class MainController extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(Paths.loginPath));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Lanchonete - Vision Informática");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("VISION.png")));
        stage.centerOnScreen();
        stage.show();
        /*
        Image anotherIcon = new Image("VISION.png");
        stage.getIcons().add(anotherIcon);

         stage.setTitle(SoftwareSpecifications.getName());
         */
    }
}
