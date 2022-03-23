import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.awt.*;

public class Guihandler
{
    private TextField invoervakLinks, invoervakRechts;
    private Button vergelijkKnop;
    private Label uitkomst, invoervakLLabel, invoervakRLabel;
    public Guihandler(GridPane pane)
    {
        createElements();
        addElements(pane);
        vergelijkKnop.setOnAction(event -> vergelijk());
    }

    public void vergelijk()
    {
        try
        {
            double getal1 = Double.parseDouble(String.valueOf(invoervakLinks.getText()));
            double getal2 = Double.parseDouble(String.valueOf(invoervakRechts.getText()));

            double vergelijking = getal1 - getal2;
            if (vergelijking > 0){
                uitkomst.setText("Getal 1 is groter dan Getal 2");
            } else if (vergelijking < 0)
            {
                uitkomst.setText("Getal 2 is groter dan Getal 1");
            } else if (vergelijking == 0)
            {
                uitkomst.setText("Getal 1 en Getal 2 zijn even groot");
            }
        }
        catch (NumberFormatException e)
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Er is een fout opgetreden");
            alert.setContentText("Voer een geldig getal in. " + "\n" +"gebruik GEEN komma maar een punt");
            alert.showAndWait();
        }
        catch (Exception e)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Er is een onbekende fout opgetreden");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    private void createElements()
    {
        //Textfield
        invoervakLinks = new TextField();
        invoervakRechts = new TextField();

        //Button
        vergelijkKnop = new Button("Vergelijk");

        //Label
        uitkomst = new Label("Druk op de vergelijk knop om te kijken welk getal groter is");
        invoervakLLabel = new Label("Voer getal 1 in ->");
        invoervakRLabel = new Label("<-Voer getal 2 in");
    }

    private void addElements(GridPane pane)
    {
        pane.add(invoervakLLabel,1,1);
        pane.add(invoervakLinks,2,1);
        invoervakLinks.setMaxWidth(100);
        invoervakRechts.setMaxWidth(100);
        pane.add(invoervakRechts,3,1);
        pane.add(invoervakRLabel,4,1);
        pane.add(vergelijkKnop,1,2);
        pane.add(uitkomst,1,3,4,1);


        //padding
        pane.setVgap(5);
        pane.setHgap(5);


    }
}