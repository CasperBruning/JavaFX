import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.text.DecimalFormat;

public class Guihandler
{
    private Button bereken;
    private Label labelTitel, labelGewicht, labelLengte, labelBMI, labelBetekenis;
    private Circle cirkel;
    private TextField textFieldGewicht, textFieldLengte;
    private static final DecimalFormat df = new DecimalFormat("0.0");

    public Guihandler(GridPane pane)
    {

        createElements(pane);
        addElements(pane);
        bereken.setOnAction(event -> berekenBMI());

    }

    public void berekenBMI()
    {
        try
        {
            double gewicht = Double.parseDouble(textFieldGewicht.getText());
            double lengteInMeter = Double.parseDouble(textFieldLengte.getText()) / 100;
            double bmi = gewicht / (lengteInMeter * lengteInMeter);
            labelBMI.setText("BMI: " + df.format(bmi));
            if (bmi < 18.5)
            {
                cirkel.setFill(Color.ORANGE);
                labelBetekenis.setText("Betekenis: Ondergewicht");
            } else if (bmi >= 18.5 && bmi < 25)
            {
                cirkel.setFill(Color.GREEN);
                labelBetekenis.setText("Betekenis: Gezond Gewicht");
            } else if (bmi >= 25 && bmi < 30)
            {
                cirkel.setFill(Color.ORANGE);
                labelBetekenis.setText("Betekenis: overgewicht");
            } else if (bmi >= 30)
            {
                cirkel.setFill(Color.RED);
                labelBetekenis.setText("Betekenis: Ernstig Overgewicht");
            }
        }
        catch (NumberFormatException e)
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Er is een fout opgetreden");
            alert.setContentText("Kijk goed of je de nummers goed ingevuld hebt. gebruik GEEN komma's");
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

    private void createElements(GridPane pane)
    {
        //button
        bereken = new Button("Bereken BMI");

        //label
        labelTitel = new Label("BMI Berekening en advies");
        labelGewicht = new Label("Gewicht (kg)");
        labelLengte = new Label("Lengte (cm)");
        labelBMI = new Label("BMI:");
        labelBetekenis = new Label("Betekenis: ");

        //circle
        cirkel = new Circle(30);

        //textField
        textFieldGewicht = new TextField();
        textFieldLengte = new TextField();
    }

    private void addElements(GridPane pane)
    {
        //button
        pane.add(bereken,1,4,2,1);

        //label
        pane.add(labelTitel, 1,1,2,1);
        pane.add(labelGewicht,1,2);
        pane.add(labelLengte,1,3);
        pane.add(labelBMI,1,5,2,1);
        pane.add(labelBetekenis,1,7,3,1);

        //circle
        pane.add(cirkel,1,6);

        //textField
        pane.add(textFieldGewicht,2,2);
        pane.add(textFieldLengte,2,3);
        textFieldGewicht.setMaxWidth(50);
        textFieldLengte.setMaxWidth(50);

        //padding
        pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(7);
        pane.setHgap(7);
    }
}