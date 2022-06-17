import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    private Label titel;
    private ComboBox<Auto> cBox;
    private TextArea tArea;
    public Guihandler(GridPane pane)
    {
        // START UI ELEMENTS
        pane.setVgap(5);
        pane.setHgap(8);
        pane.setPadding(new Insets(10,15,20,15));
        //--------------
        titel = new Label("Kies een auto:");
        tArea = new TextArea();
        cBox = new ComboBox<Auto>();

        //--------------
        pane.add(titel,1,1);
        //--------------
        pane.add(cBox,1,2);
        //--------------
        pane.add(tArea,1,3);
        tArea.setMaxSize(300,200);
        tArea.setEditable(false);
        //--------------
        // END UI ELEMENTS
        Garage garage = new Garage();

        ObservableList<Auto>autoLijst=FXCollections.observableArrayList(garage.returnAuto());

        cBox.setItems(autoLijst);

        cBox.setOnAction(event -> showAuto());

    }

    public void showAuto()
    {
        Auto auto = cBox.getValue();
        tArea.clear();
        tArea.appendText("autosoort: " + auto.getAutosoort() + "/n" + "Merk: " + auto.getMerk() + "\n" + "Model: " + auto.getModel() + "\n" + "Vermogen: " + auto.getVermogen() + "\n" + "Brandstof: " + auto.getBrandstof() );
    }
}