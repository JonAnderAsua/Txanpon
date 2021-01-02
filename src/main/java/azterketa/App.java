package azterketa;

import azterketa.ui.MainKud;
import javafx.animation.ParallelTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private Parent mainUI;
    private Stage stage;
    private MainKud mainKud;


    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        pantailakKargatu();

        stage.setTitle("Azterketa");
        stage.setScene(new Scene(mainUI, 714, 554));
        stage.show();

    }

    private void pantailakKargatu() throws IOException {
        FXMLLoader loaderKautotu = new FXMLLoader(getClass().getResource("/main.fxml"));
        mainUI = (Parent) loaderKautotu.load();
        mainKud = loaderKautotu.getController();
        mainKud.setMainApp(this);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
