import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    private TextField invoer, uitvoerSubtotaal, uitvoerBTW, uitvoerTotaalExBTW, uitvoerTotaal;
    private Label labelInvoer, labelSubtotaal, labelBTW, labelTotaalExBTW, labelTotaal;
    private Button buttonTotaal, buttonReset;

    public Guihandler(GridPane pane)
    {
        Kassa kassa = new Kassa();
        createElements();
        createPane(pane);
        buttonTotaal.setOnAction(event -> bereken(kassa));
        buttonReset.setOnAction(event -> reset(kassa));

    }

    public void bereken(Kassa kassa){
        double bedrag = Double.parseDouble(invoer.getText());
        kassa.telOp(bedrag);

        uitvoerSubtotaal.setText(String.valueOf(kassa.getSubtotaal()));
        uitvoerBTW.setText(String.valueOf(kassa.berekenBTW()));
        uitvoerTotaalExBTW.setText(String.valueOf(kassa.berekenSubtotaalExBTW()));
        uitvoerTotaal.setText(String.valueOf(kassa.getSubtotaal()));
        invoer.setText("");
    }

    public void reset(Kassa kassa)
    {
        kassa.reset();

        uitvoerSubtotaal.setText(String.valueOf(kassa.getSubtotaal()));
        uitvoerBTW.setText(String.valueOf(kassa.berekenBTW()));
        uitvoerTotaalExBTW.setText(String.valueOf(kassa.berekenSubtotaalExBTW()));
        uitvoerTotaal.setText(String.valueOf(kassa.getSubtotaal()));
    }

    private void createPane(GridPane pane)
    {
        //textfield
        pane.add(invoer, 2,1);
        pane.add(uitvoerSubtotaal, 2,2);
        pane.add(uitvoerBTW, 2,3);
        pane.add(uitvoerTotaalExBTW, 2,4);
        pane.add(uitvoerTotaal, 2,5);
        //label
        pane.add(labelInvoer,1,1);
        pane.add(labelSubtotaal,1,2);
        pane.add(labelBTW,1,3);
        pane.add(labelTotaalExBTW,1,4);
        pane.add(labelTotaal,1,5);
        //button
        pane.add(buttonTotaal,3,2);
        pane.add(buttonReset,3,5);

        pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(5);
        pane.setHgap(8);
    }


    private void createElements()
    {
        //Textfield
        invoer = new TextField();
        uitvoerSubtotaal = new TextField("0.0");
        uitvoerBTW = new TextField("0.0");
        uitvoerTotaalExBTW = new TextField("0.0");
        uitvoerTotaal = new TextField("0.0");
        //Label
        labelInvoer = new Label("Voer bedrag in");
        labelSubtotaal = new Label("Subtotaal");
        labelBTW = new Label("btw");
        labelTotaalExBTW = new Label("Totaal ex btw");
        labelTotaal = new Label("Totaal");
        //Button
        buttonTotaal = new Button("Totaal");
        buttonReset = new Button("Reset");
    }
}