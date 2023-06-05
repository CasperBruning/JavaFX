import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;


public class Guihandler
{
    private final TextField outputUur;
    private final TextField outputDag;
    private final TextField outputJaar;

    private final Text inputLabel;
    private final Text outputLabel;

    private final Button rekenen;

    public Guihandler(FlowPane root)
    {
        outputUur = new TextField();
        outputDag = new TextField();
        outputJaar = new TextField();

        outputUur.setEditable(false);
        outputDag.setEditable(false);
        outputJaar.setEditable(false);

        inputLabel = new Text("Invoer: ");
        outputLabel = new Text("uitvoer: ");

        rekenen = new Button("Rekenen");

        rekenen.setOnAction(e -> Rekenen());

        root.getChildren().addAll(inputLabel, outputLabel, outputUur, outputDag, outputJaar, rekenen);
    }


    private void Rekenen()
    {
        double minuut = 1;
        double uurberekenen = minuut * 60;
        double dagberekenen = uurberekenen * 24;
        double jaarberekenen = dagberekenen * 365;

        outputUur.setText(Double.toString(uurberekenen));
        outputDag.setText(Double.toString(dagberekenen));
        outputJaar.setText(Double.toString(jaarberekenen));
    }
}