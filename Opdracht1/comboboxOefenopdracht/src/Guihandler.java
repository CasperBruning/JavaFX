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
    private ArrayList<Artikel> artikelen;
    public Guihandler(GridPane pane)
    {
        pane.setVgap(5);
        pane.setHgap(8);
        pane.setPadding(new Insets(10,15,20,15));

        titel = new Label("Kies een artikel:");
        tArea = new TextArea();
        cBox = new ComboBox<Artikel>();

        //--------------
        pane.add(titel,1,5);
        //--------------
        pane.add(cBox,1,6);
        //--------------
        pane.add(tArea,1,7, 2,1);
        tArea.setMaxSize(300,200);
        tArea.setEditable(false);
        //--------------

        artikelen = maakArtikelen();

        ObservableList<Artikel>artikelenLijst=FXCollections.observableArrayList(artikelen);
        cBox.setItems(artikelenLijst);

        cBox.setOnAction(event -> showArtikel());



    }

    private void showArtikel(){
        Artikel artikel = cBox.getValue();
        tArea.clear();
        tArea.appendText("Artikel: " + artikel.getArtikelNaam() + "\n" + "Voorraad: " + artikel.getArtikelAantal() + "\n" + "Prijs: " + artikel.getArtikelPrijs());
    }

    private ArrayList<Artikel> maakArtikelen(){
        ArrayList<Artikel>artikelenList=new ArrayList<Artikel>();
        Artikel artikel = new Artikel("appel", 5, 1.99);
        artikelenList.add(artikel);
        artikel = new Artikel("peer", 2, 4.99);
        artikelenList.add(artikel);
        artikel = new Artikel("banaan", 8, 2.99);
        artikelenList.add(artikel);
        artikel = new Artikel("perzik", 3, 0.99);
        artikelenList.add(artikel);


        return artikelenList;
    }
}