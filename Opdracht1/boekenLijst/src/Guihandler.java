import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class Guihandler
{
    private final Label lblBoeken;
    private final ComboBox<Boek>comboBoeken;
    private final TextArea areaBoeken;
    private ArrayList<Boek> boeken;

    public Guihandler(GridPane pane)
    {
        pane.setVgap(5);
        pane.setHgap(8);
        pane.setPadding(new Insets(10,15,20,15));

        boeken = maakBoeken();

        comboBoeken=new ComboBox<Boek>();

        ObservableList<Boek>boekenlijst=FXCollections.observableArrayList(boeken);
        comboBoeken.setItems(boekenlijst);

        comboBoeken.setOnAction(event->showBoek());

        lblBoeken = new Label("Boekenlijst");

        areaBoeken=new TextArea();
        areaBoeken.setMinSize(300,200);
        areaBoeken.setEditable(false);

        pane.add(lblBoeken,0,0);
        pane.add(comboBoeken,0,1);
        pane.add(areaBoeken,0,2);

    }

    /**|
     *Laat het boek zien dat geselecteerd is */
     private void showBoek()
     {
         Boek boek=comboBoeken.getValue();
         areaBoeken.clear();
         areaBoeken.appendText(boek.getNaam() + " - " + boek.getSchrijver() + " Oplage: " + boek.getOplagen() + "\n");
     }
     /**
     *Maak een reeks nieuwe boeken aan
     @return ArrayList<Boek>
     */
     private ArrayList<Boek> maakBoeken()
     {
         ArrayList<Boek>newBoekenList=new ArrayList<Boek>();
         Boek boek=new Boek("Netwerken deel3","John Bakker",500);
         newBoekenList.add(boek);
         boek=new Boek("Aan de slag met Java","Gertjan Laan",1000);
         newBoekenList.add(boek);
         boek=new Boek("Harry Potter and the Chamber of Secrets","J.K. Rowling",5000);
         newBoekenList.add(boek);

         return newBoekenList;
     }
}