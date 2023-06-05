import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import java.text.DecimalFormat;

public class Guihandler
{
    public DecimalFormat df = new DecimalFormat("0.00");

    private TextArea listarea;
    private Button btn;

    private Canvas canvas;
    private GraphicsContext gc;
    private HBox hbox;

    public Guihandler(GridPane pane)
    {
        listarea = new TextArea();
        listarea.setMaxWidth(200);
        btn = new Button("vul in");

        listarea.relocate(0, 200);
        btn.relocate(0, 100);

        hbox = new HBox();
        hbox.setAlignment(Pos.BASELINE_CENTER);
        hbox.getChildren().addAll(listarea, btn);

        canvas = new Canvas(150, 250);
        gc = canvas.getGraphicsContext2D();
        pane.getChildren().addAll(hbox, canvas);

        btn.setOnAction(event -> tableMethod());


    }

    private void tableMethod()
    {
        try
        {
            listarea.clear();
            int waarde = 0;
            for (int i = 0; i < 1001; i++)
            {
                waarde += i;

            }
            listarea.setText(waarde + "");

        } catch (NumberFormatException e)
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Er is een fout opgetreden");
            alert.setContentText("Voer een HEEL getal in. geen kommas");
            alert.showAndWait();
        } catch (Exception e)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Er is een onbekende fout opgetreden");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }

    }
}