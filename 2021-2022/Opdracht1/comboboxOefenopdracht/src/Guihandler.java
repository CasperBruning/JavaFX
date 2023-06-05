import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class Guihandler
{
    private Label titel;
    private ComboBox<Artikel> cBox;
    private TextArea tArea;
    public Guihandler(GridPane pane)
    {
    // START UI ELEMENTS
        pane.setVgap(5);
        pane.setHgap(8);
        pane.setPadding(new Insets(10,15,20,15));
        //--------------
        titel = new Label("Kies een artikel:");
        tArea = new TextArea();
        cBox = new ComboBox<Artikel>();

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


        //Haal uit voorraad de arraylist van artikelen
        Voorraad voorraad = new Voorraad();

        ObservableList<Artikel>artikelenLijst=FXCollections.observableArrayList(voorraad.getArtikelen());

        //Hier vul je de Combobox met de arraylist
        cBox.setItems(artikelenLijst);

        //Met deze methode laat je het artikel zien
        cBox.setOnAction(event -> showArtikel());



    }

    private void showArtikel(){
        Artikel artikel = cBox.getValue();
        tArea.clear();
        tArea.appendText("Artikel: " + artikel.getArtikelNaam() + "\n" + "Voorraad: " + artikel.getArtikelAantal() + "\n" + "Prijs: " + artikel.getArtikelPrijs());
    }
}