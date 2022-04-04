import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    Canvas canvas;
    GraphicsContext gc;

    public Guihandler(GridPane pane)
    {
        canvas = new Canvas();
        canvas.setHeight(500);
        canvas.setWidth(500);

        gc = canvas.getGraphicsContext2D();

        gc.strokeOval(0, 0, 200, 200);

        int size = 200;
        double pos = 0;

        for (int i = 1; size >= 10; i++)
        {
            gc.strokeOval(pos,pos, size,  size);
            size -=5;
            pos += 2.5;
        }
        pane.add(canvas, 0, 0);
    }
}