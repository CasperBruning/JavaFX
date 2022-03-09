import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    private TextField input1,input2;
    private Button bereken;
    private Label input1label, input2label, outputlabel;

    public Guihandler(GridPane pane)
    {
        createElements();

        //Positioning and Adding
        pane.add(input1,2,1);
        pane.add(input2,2,2);
        pane.add(input1label,1,1);
        pane.add(input2label,1,2);
        pane.add(bereken,1,3);
        pane.add(outputlabel,1,4,2,1);

        //button
        bereken.setOnAction(event -> berekenGemiddelde());
    }

    public void berekenGemiddelde()
    {
        int berekening = (Integer.parseInt(input1.getText()) + Integer.parseInt(input2.getText())) / 2;
        outputlabel.setText("Gemiddelde in hele getallen: " + String.valueOf(berekening));
    }

    public void createElements()
    {
        input1 = new TextField();
        input2 = new TextField();
        bereken = new Button("Bereken");
        input1label = new Label("Getal1");
        input2label = new Label("Getal2");
        outputlabel = new Label();
    }
}