import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application
{

    public void start(Stage primaryStage) throws Exception
    {
        GridPane root = new GridPane();
        Guihandler gui = new Guihandler(root);
        primaryStage.setTitle("test");
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}