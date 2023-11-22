import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
//Project configured to be run in windows using:
// - jdk21
// - javafx-sdk-21.0.1
// Compilation was successful!
//      See: https://prnt.sc/vRh7hpkLpD_z

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        //Interesting features of JavaFX:
        // - StackPane (back-to-front ordering of children)
        // - Buttons
        // - Image Displays        


        StackPane sp = new StackPane();
        ImageView iv = new ImageView("cat.gif");
        sp.getChildren().add(iv);
        Button b = new Button("Useless Button");
        sp.getChildren().add(b);
        Scene s = new Scene(sp, 640, 480);

        primaryStage.setTitle("CS151 HW1 JavaFX");
        primaryStage.setScene(s);
        primaryStage.show(); //display stage
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
