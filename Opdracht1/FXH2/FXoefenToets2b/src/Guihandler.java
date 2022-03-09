import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class Guihandler
{
    private final Label gewichtlabel, lengtelabel, bmilabel;
    private final TextField gewicht, lengte, bmi;
    private final Button knop;


    public Guihandler(FlowPane pane)
    {
        gewichtlabel = new Label("Gewicht");
        gewicht = new TextField();
        lengtelabel = new Label("Lengte");
        lengte = new TextField();
        bmilabel = new Label("BMI");
        bmi = new TextField();
        bmi.setEditable(false);
        knop = new Button("Bereken BMI");

        knop.setOnAction(event -> bereken());

        pane.getChildren().addAll(gewichtlabel,gewicht,lengtelabel,lengte,bmilabel,bmi,knop);
    }

    private void bereken()
    {
        double bmiResult = Double.parseDouble(gewicht.getText()) / ( (Double.parseDouble(lengte.getText())/ 100) * (Double.parseDouble(lengte.getText()) / 100) );
        bmi.setText("" + String.format("%.1f", bmiResult));
    }
}