import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    private Label invoerLabel, tienvoudLabel;
    private TextField invoervak, uitvoervak;


    public Guihandler(GridPane pane)
    {
        invoerLabel = new Label("Voer een geheel getal in ");
        tienvoudLabel = new Label("10-voud");

        invoervak = new TextField();
        uitvoervak = new TextField();

        pane.setVgap(5);
        pane.setHgap(8);
        pane.setPadding(new Insets(10,15,10,15));

        invoervak.setAlignment(Pos.CENTER_RIGHT);
        uitvoervak.setAlignment(Pos.CENTER_RIGHT);

        invoervak.setOnAction(event -> bereken());

        pane.add(invoerLabel, 0, 0);
        pane.add(invoervak, 1, 0);
        pane.add(tienvoudLabel, 0, 1);
        pane.add(uitvoervak, 1, 1);

    }

    // bereken 10 voud
    private void bereken()
    {
        String invoer = invoervak.getText();
        try
        {
            int getal = Integer.parseInt(invoer);
            int resultaat = 10 * getal;
            uitvoervak.setText("" + resultaat);
        }
        catch(NumberFormatException e)
        {
            uitvoervak.setText("Voer een geheel getal in");
        }
    }
}