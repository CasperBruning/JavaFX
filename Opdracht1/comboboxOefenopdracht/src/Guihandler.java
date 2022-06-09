import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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

        titel = new Label('Kies een artikel:');
        pane.add(titel,1,1);

        cBox = new ComboBox()
    }
}