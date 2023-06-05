import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

import javafx.scene.control.TextField;

public class Guihandler
{
    private final TextField tekstvak;
    private final TextField tekstvak1;
    private final Button knop;
    private final Button knop1;

    public Guihandler(FlowPane pane)
    {
        tekstvak = new TextField();
        tekstvak1 = new TextField();
        knop = new Button("Send");
        knop1 = new Button("Send");

        knop.setOnAction(event -> setTekstvak());
        knop1.setOnAction(event -> setTekstvak1());

        pane.getChildren().addAll(tekstvak, knop, tekstvak1, knop1);

    }

    private void setTekstvak(){
        tekstvak.setText("Casper");
    }
    private void setTekstvak1(){
        tekstvak1.setText("Bruning");
    }
}