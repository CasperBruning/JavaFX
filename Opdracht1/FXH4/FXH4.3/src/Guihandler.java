import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    private TextField tekstvak;
    private Button knop;
    private Label output;

    private double groeiBevolkingPerJaar = 1.0165;
    private int jaartal = 2020;

    public Guihandler(GridPane pane)
    {
        tekstvak = new TextField("3000000000");
        knop = new Button("Bereken");
        output = new Label("Jaartal: ");

        pane.add(tekstvak,1,1);
        pane.add(knop,1,2);
        pane.add(output,1,3);

        knop.setOnAction(event -> berekenBevolking());
    }

    public void berekenBevolking()
    {
        double bevolking = Double.parseDouble(tekstvak.getText());
        double berekening = bevolking * groeiBevolkingPerJaar;
        tekstvak.setText(String.valueOf(berekening));
        jaartal++;
        output.setText("Jaartal: " + String.valueOf(jaartal));
    }

    
}