
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

import javafx.scene.control.TextField;

public class Guihandler
{

    private final TextField tekstvak;
    private final Button knop1;
    private final Button knop2;
    private final Button knop3;

    public Guihandler(FlowPane pane)
    {
        tekstvak = new TextField();
        knop1 = new Button("Send");
        knop2 = new Button("Send");
        knop3 = new Button("Send");
        pane.getChildren().addAll(tekstvak, knop1, knop2, knop3);

        knop1.setOnAction(event -> setTekst1());
        knop2.setOnAction(event -> setTekst2());
        knop3.setOnAction(event -> setTekst3());

    }

    private void setTekst1()
    {
        tekstvak.setText("Brillen");
    }

    private void setTekst2()
    {
        tekstvak.setText("Boi");
    }

    private void setTekst3()
    {
        tekstvak.setText("Jelmer");
    }
}