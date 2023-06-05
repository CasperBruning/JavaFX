import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    private TextField textvak;
    private Button knop;
    private Label output;
    public int counter;
    public String intervalSTR;

    public Guihandler(GridPane pane)
    {
        textvak = new TextField();
        knop = new Button("+");
        output = new Label();
        pane.add(textvak,1,1);
        pane.add(knop,1,2);
        pane.add(output,1,3);

        knop.setOnAction(event -> counterMethod());
    }

    public void counterMethod()
    {
        intervalSTR = textvak.getText();
        counter += Integer.parseInt(intervalSTR);
        output.setText(String.valueOf(counter));
    }

}