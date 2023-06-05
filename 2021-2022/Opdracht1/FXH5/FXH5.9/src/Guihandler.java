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
    private TextField text;

    private Canvas canvas;
    private GraphicsContext gc;
    private HBox hbox;

    public Guihandler(GridPane pane)
    {
        listarea = new TextArea();
        listarea.setMaxWidth(200);
        listarea.setEditable(false);
        text = new TextField();
        btn = new Button("vul in");

        pane.add(text,1,1);
        pane.add(btn,1,2);
        pane.add(listarea,1,3);


        btn.setOnAction(event -> tableMethod());


    }
    private void tableMethod()
    {
        try
        {
            int jaartal = Integer.parseInt(text.getText());
            if (jaartal%400 == 0)
            {
                listarea.setText("Het is een schikkeljaar");
            } else
                {
                listarea.setText("Het is geen schikkeljaar");
            }
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