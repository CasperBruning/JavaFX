import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    private TextField input, output;
    private Button knop, clear;
    private Label labelInput, labelOutput;

    public Guihandler(GridPane pane)
    {
        createElements();

        //Positioning
        pane.add(input,2,1);
        pane.add(output,2,2);
        pane.add(labelInput,1,1);
        pane.add(labelOutput,1,2);
        pane.add(knop,1,3);
        pane.add(clear,2,3);

        //Buttons
        knop.setOnAction(event -> knopMethod());
        clear.setOnAction(event -> clearMethod());
    }

    public void knopMethod()
    {
        int intInput = Integer.parseInt(input.getText());
        int berekening = intInput * 12;
        output.setText(String.valueOf(berekening) + " euro");
    }

    public void clearMethod()
    {
        input.setText("");
        output.setText("");
    }

    private void createElements()
    {
        input = new TextField();
        output = new TextField();
        output.setEditable(false);
        knop = new Button("Set maandsalaris");
        clear = new Button("Clear");
        labelInput = new Label("Maandsalaris");
        labelOutput = new Label("Jaarsalaris");
    }
}