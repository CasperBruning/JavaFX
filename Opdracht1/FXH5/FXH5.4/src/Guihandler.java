import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

public class Guihandler
{
    private Label label;
    private TextField invoervak;
    private Canvas canvas;
    private GraphicsContext gc;
    private HBox hbox;
    private int aantal;
    public Guihandler(GridPane pane)
    {
        label = new Label("Aantal cirkels: ");
        invoervak = new TextField();
        invoervak.setAlignment(Pos.CENTER_RIGHT);
        invoervak.setPrefWidth(40);

        hbox = new HBox();
        hbox.setAlignment(Pos.BASELINE_CENTER);
        hbox.getChildren().addAll(label, invoervak);

        canvas = new Canvas(250,250);
        gc = canvas.getGraphicsContext2D();
        pane.getChildren().addAll(hbox, canvas);

        invoervak.setOnAction(event -> action());

        int intervalMiliseconden = 100;
        // set timeline, let op! javafx klassen importeren
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(intervalMiliseconden),
                event -> action()));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

    }

    private void action()
    {
        String invoer = invoervak.getText();
        aantal++;
//        aantal = Integer.parseInt(invoer);

        gc.clearRect(0,0, canvas.getWidth(), canvas.getHeight());

        for (int i = 1; i <= aantal; i++)
        {
            gc.strokeRect(20+1*i,20+1*i,20+2*i, 20+2*i);
        }
    }
}