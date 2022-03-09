import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

import java.util.Locale;

public class Guihandler
{
    private final Label input, output;
    private final TextField inputVak, lowercaseOutput, uppercaseOutput;
    private final Button zetOm, clear;

    public Guihandler(FlowPane pane)
    {
        input = new Label("Input");
        output = new Label("output");
        inputVak = new TextField();
        lowercaseOutput = new TextField();
        lowercaseOutput.setEditable(false);
        uppercaseOutput = new TextField();
        uppercaseOutput.setEditable(false);
        zetOm = new Button("Zet om");
        clear = new Button("clear");
        pane.getChildren().addAll(input, inputVak, output, uppercaseOutput, lowercaseOutput, zetOm, clear);

        zetOm.setOnAction(event ->
        {
            String test = inputVak.getText();
            uppercaseOutput.setText(test.toUpperCase());
            lowercaseOutput.setText(test.toLowerCase());
        });

        clear.setOnAction(event ->
        {
            lowercaseOutput.clear();
            uppercaseOutput.clear();
        });


    }
}