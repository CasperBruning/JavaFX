import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    private Label titel, naamLBL, voorraadLBL, prijsLBL;
    private TextField naamTXT, voorraadTXT, prijsTXT;
    private Button voegToeBTN;
    private ComboBox<Artikel> cBox;
    private TextArea tArea;

    //Haal uit voorraad de arraylist van artikelen
    Voorraad voorraad = new Voorraad();
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

        naamLBL = new Label("Naam: ");
        voorraadLBL = new Label("Voorraad: ");
        prijsLBL = new Label("Prijs: ");
        naamTXT = new TextField();
        voorraadTXT = new TextField();
        prijsTXT = new TextField();
        voegToeBTN = new Button("Voeg Artikel Toe");
        //--------------
        pane.add(titel,1,1);
        //--------------
        pane.add(cBox,1,2);
        //--------------
        pane.add(tArea,1,3,2,1);
        tArea.setMaxSize(300,200);
        tArea.setEditable(false);
        //--------------
        pane.add(naamLBL, 1,4);
        pane.add(voorraadLBL,1,5);
        pane.add(prijsLBL,1,6);
        pane.add(naamTXT,2,4);
        pane.add(voorraadTXT,2,5);
        pane.add(prijsTXT,2,6);
        pane.add(voegToeBTN,1,7);
    // END UI ELEMENTS


        ObservableList<Artikel>artikelenLijst=FXCollections.observableArrayList(voorraad.getArtikelen());

        //Hier vul je de Combobox met de arraylist
        cBox.setItems(artikelenLijst);

        //Met deze methode laat je het artikel zien
        cBox.setOnAction(event -> showArtikel());

        voegToeBTN.setOnAction(event -> addArtikel());

    }

    private void showArtikel(){
        Artikel artikel = cBox.getValue();
        tArea.clear();
        tArea.appendText("Artikel: " + artikel.getArtikelNaam() + "\n" + "Voorraad: " + artikel.getArtikelAantal() + "\n" + "Prijs: " + artikel.getArtikelPrijs());
    }

    public void addArtikel(){
        Artikel artikel = new Artikel(naamTXT.getText(), Integer.parseInt(voorraadTXT.getText()), Double.parseDouble(prijsTXT.getText()));
        voorraad.addArtikel(artikel);

        ObservableList<Artikel>artikelenLijst=FXCollections.observableArrayList(voorraad.getArtikelen());

        //Hier vul je de Combobox met de arraylist
        cBox.setItems(artikelenLijst);

        naamTXT.clear();
        voorraadTXT.clear();
        prijsTXT.clear();
    }
}