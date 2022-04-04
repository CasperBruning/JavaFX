import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;

public class Guihandler
{
    Canvas canvas;
    GraphicsContext gc;
    HBox box;

    Rectangle hoekje;

    public Guihandler(GridPane pane)
    {
        hoekje = new Rectangle();
        hoekje.setWidth(100);
        hoekje.setHeight(30);
        hoekje.relocate(100,30);

        //Canvas maken en toevoegen aan de pane
        canvas = new Canvas(200,200);

        //Graphics Context
        gc = canvas.getGraphicsContext2D();

        //HBOX
        box = new HBox();
        box.setAlignment(Pos.BOTTOM_CENTER);
        box.setPrefHeight(200);
        box.setPrefWidth(200);

        //Add Children
        box.getChildren().addAll(hoekje);
        pane.getChildren().addAll(box, canvas);



    }
}