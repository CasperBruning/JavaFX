import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application
{

    public void start(Stage primaryStage) throws Exception
    {
        Pane root = new Pane();
        Guihandler gui = new Guihandler(root);
        primaryStage.setTitle("test");
        primaryStage.setScene(new Scene(root, 520, 520));
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}