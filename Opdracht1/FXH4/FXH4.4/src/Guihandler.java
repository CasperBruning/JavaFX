import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    private TextField invoer, uitvoerSubtotaal, uitvoerBTW, uitvoerTotaalExBTW, uitvoerTotaal;
    private Label labelInvoer, labelSubtotaal, labelBTW, labelTotaalExBTW, labelTotaal;
    private Button buttonTotaal, buttonReset, eenBTN, tweeBTN, drieBTN, vierBTN, vijfBTN, zesBTN, zevenBTN, achtBTN, negenBTN, nulBTN, plusBTN;

    public Guihandler(GridPane pane)
    {
        Kassa kassa = new Kassa();
        createElements();
        createPane(pane);
        plusBTN.setOnAction(event -> bereken(kassa));
        buttonReset.setOnAction(event -> reset(kassa));
        eenBTN.setOnAction(event -> eenBTN() );
        tweeBTN.setOnAction(event -> tweeBTN() );
        drieBTN.setOnAction(event -> drieBTN() );
        vierBTN.setOnAction(event -> vierBTN() );
        vijfBTN.setOnAction(event -> vijfBTN() );
        zesBTN.setOnAction(event -> zesBTN() );
        zevenBTN.setOnAction(event -> zevenBTN() );
        achtBTN.setOnAction(event -> achtBTN() );
        negenBTN.setOnAction(event -> negenBTN() );
        nulBTN.setOnAction(event -> nulBTN() );

    }
    public void eenBTN(){
        invoer.appendText("1");
    }
    public void tweeBTN(){
        invoer.appendText("2");
    }
    public void drieBTN(){
        invoer.appendText("3");
    }
    public void vierBTN(){
        invoer.appendText("4");
    }
    public void vijfBTN(){
        invoer.appendText("5");
    }
    public void zesBTN(){
        invoer.appendText("6");
    }
    public void zevenBTN(){
        invoer.appendText("7");
    }
    public void achtBTN(){
        invoer.appendText("8");
    }
    public void negenBTN(){
        invoer.appendText("9");
    }
    public void nulBTN(){
        invoer.appendText("0");
    }


    public void bereken(Kassa kassa){
        try
        {
            double bedrag = Double.parseDouble(invoer.getText());
            kassa.telOp(bedrag);

            uitvoerSubtotaal.setText(String.valueOf(kassa.getSubtotaal()));
            uitvoerBTW.setText(String.valueOf(kassa.berekenBTW()));
            uitvoerTotaalExBTW.setText(String.valueOf(kassa.berekenSubtotaalExBTW()));
            uitvoerTotaal.setText(String.valueOf(kassa.getSubtotaal()));
            invoer.setText("");
        }
        catch (NumberFormatException e )
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Er is een fout opgetreden");
            alert.setContentText("Voer geen letters of komma's in. gebruik hiervoor een punt");
            alert.showAndWait();
        }
        catch (Exception e )
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Er is een onbekende fout opgetreden");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }

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
//        pane.add(buttonTotaal,3,2);
        pane.add(buttonReset,3,5);
        pane.add(eenBTN , 5,1,3,3);
        pane.add(tweeBTN,8,1,3,3);
        pane.add(drieBTN,11,1,3,3);
        pane.add(vierBTN,5,4,3,3);
        pane.add(vijfBTN,8,4,3,3);
        pane.add(zesBTN,11,4,3,3);
        pane.add(zevenBTN,5,7,3,3);
        pane.add(achtBTN,8,7,3,3);
        pane.add(negenBTN,11,7,3,3);
        pane.add(nulBTN,8,10,3,3);
        pane.add(plusBTN,11,10,3,3);

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
        eenBTN = new Button("1");
        eenBTN.setPrefWidth(100);
        eenBTN.setPrefHeight(100);
        tweeBTN = new Button("2");
        tweeBTN.setPrefWidth(100);
        tweeBTN.setPrefHeight(100);
        drieBTN = new Button("3");
        drieBTN.setPrefWidth(100);
        drieBTN.setPrefHeight(100);
        vierBTN = new Button("4");
        vierBTN.setPrefWidth(100);
        vierBTN.setPrefHeight(100);
        vijfBTN = new Button("5");
        vijfBTN.setPrefWidth(100);
        vijfBTN.setPrefHeight(100);
        zesBTN = new Button("6");
        zesBTN.setPrefWidth(100);
        zesBTN.setPrefHeight(100);
        zevenBTN = new Button("7");
        zevenBTN.setPrefWidth(100);
        zevenBTN.setPrefHeight(100);
        achtBTN = new Button("8");
        achtBTN.setPrefWidth(100);
        achtBTN.setPrefHeight(100);
        negenBTN = new Button("9");
        negenBTN.setPrefWidth(100);
        negenBTN.setPrefHeight(100);
        nulBTN = new Button("0");
        nulBTN.setPrefWidth(100);
        nulBTN.setPrefHeight(100);
        plusBTN = new Button("+");
        plusBTN.setPrefWidth(100);
        plusBTN.setPrefHeight(100);
    }
}