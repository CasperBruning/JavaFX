import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Guihandler
{
    private final Circle circle;
    private int xPos;
    private int yPos;
    private int radius;

    public Guihandler(Pane pane)
    {
        xPos = 20;
        yPos = 20;
        radius = 20;
        circle = new Circle(xPos, yPos, radius);

        int intervalMiliseconden = 3;
        // set timeline, let op! javafx klassen importeren
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(intervalMiliseconden),
                event -> timedAction()));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();



        pane.getChildren().addAll(circle);
    }

    // methode
    private void timedAction()
    {
        if (circle.getCenterX() < 500 && circle.getCenterY() == 20)
        {
            circle.setCenterX(xPos += 2);
            circle.setFill(Color.BLUE);
        } else if (circle.getCenterX() == 500 && circle.getCenterY() < 500)
        {
            circle.setCenterY(yPos += 2);
            circle.setFill(Color.PURPLE);

        } else if (circle.getCenterX() > 20 && circle.getCenterY() == 500)
        {
            circle.setCenterX(xPos -= 2);
            circle.setFill(Color.LIGHTBLUE);

        } else if (circle.getCenterX() == 20 && circle.getCenterY() > 20)
        {
            circle.setCenterY(yPos -= 2);
            circle.setFill(Color.DARKBLUE);

        }
    }
}
