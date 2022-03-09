import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class Guihandler
{

    private final TextField uur, minuut, seconde;
    private final Button bereken;


    public Guihandler(FlowPane pane)
    {
        uur = new TextField();
        minuut = new TextField();
        seconde = new TextField();
        uur.setEditable(false);
        minuut.setEditable(false);
        seconde.setEditable(false);
        bereken = new Button("Bereken");

        bereken.setOnAction(berekenTijd());

        pane.getChildren().addAll(bereken, uur, minuut, seconde);
    }

    private EventHandler<ActionEvent> berekenTijd()
    {
        double leefTijdInSeconden = 5454532;
        double aantalUur = leefTijdInSeconden / 60 / 60;
        double aantalMinuten = leefTijdInSeconden / 60;

        uur.setText(Double.toString(aantalUur));
        minuut.setText(Double.toString(aantalMinuten));
        seconde.setText(Double.toString(leefTijdInSeconden));
        return null;
    }
}
