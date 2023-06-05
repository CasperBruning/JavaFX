import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.awt.*;
import java.util.Arrays;

public class Guihandler
{
    private TextField invoervakEen, invoervakTwee, invoervakDrie;
    private Button sorteerKnop;
    private Label uitkomstLBL, invoervakLLabel;
    public Guihandler(GridPane pane)
    {
        createElements();
        addElements(pane);
        sorteerKnop.setOnAction(event -> sorteren());
    }

    public void sorteren()
    {
        try
        {
            int sorteerArray[] = new int[] {Integer.parseInt(String.valueOf(invoervakEen.getText())), Integer.parseInt(String.valueOf(invoervakTwee.getText())), Integer.parseInt(String.valueOf(invoervakDrie.getText()))};
            Arrays.sort(sorteerArray);
            System.out.println("De array oplopend gesorteerd");
            String uitkomst = "Gesorteerde getallen: ";

            for (int i = 0; i < sorteerArray.length; i++)
            {
                uitkomst += String.valueOf(sorteerArray[i]);
                uitkomst += " -> ";
            }

            uitkomstLBL.setText(uitkomst);

        }catch (NumberFormatException e)
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Er is een fout opgetreden");
            alert.setContentText("Voer een HEEL getal in. geen kommas");
            alert.showAndWait();
        }catch (Exception e)
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Er is een onbekende fout opgetreden");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    private void createElements()
    {
        //Textfield
        invoervakEen = new TextField();
        invoervakTwee = new TextField();
        invoervakDrie = new TextField();

        //Button
        sorteerKnop = new Button("Sorteer");

        //Label
        uitkomstLBL = new Label("Druk op de sorteer knop om de getallen te sorteren van hoog naar laag");
        invoervakLLabel = new Label("Voer 3 getallen in ->");
    }

    private void addElements(GridPane pane)
    {
        pane.add(invoervakLLabel,1,1);
        pane.add(invoervakEen,2,1);
        pane.add(invoervakTwee,3,1);
        pane.add(invoervakDrie,4,1);
        invoervakEen.setMaxWidth(100);
        invoervakTwee.setMaxWidth(100);
        invoervakDrie.setMaxWidth(100);
        pane.add(sorteerKnop,1,2);
        pane.add(uitkomstLBL,1,3,4,1);


        //padding
        pane.setVgap(5);
        pane.setHgap(5);


    }
}