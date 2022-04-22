import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    private Label titelLBL, puntenInvoerLBL;
    private TextField puntenInvoerTXT;
    private Button duitslandBTN, engelandBTN, frankrijkBTN, nederlandBTN;
    private Canvas canvas;
    private GraphicsContext gc;

    Landen duitsland = new Landen("duitsland");
    Landen engeland = new Landen("engeland");
    Landen frankrijk = new Landen("frankrijk");
    Landen nederland = new Landen("nederland");

    public Guihandler(GridPane pane)
    {
        createElements(pane);
        addElements(pane);
//        draw();
        duitslandBTN.setOnAction(event -> duitsland());
        engelandBTN.setOnAction(event -> engeland());
        frankrijkBTN.setOnAction(event -> frankrijk());
        nederlandBTN.setOnAction(event -> nederland());

    }

        private void createElements(GridPane pane)
    {
        //LABEL
        titelLBL = new Label("Songfestival 2021 voting application");
        puntenInvoerLBL = new Label("Aantal punten");

        //TEXTFIELD
        puntenInvoerTXT = new TextField();

        //BUTTON
        duitslandBTN = new Button("Duitsland");
        engelandBTN = new Button("Engeland");
        frankrijkBTN = new Button("Frankrijk");
        nederlandBTN = new Button("Nederland");

        //CANVAS
            //MAAK EEN CANVAS OBJECT VAN 250 BIJ 250 PIXELS
            canvas = new Canvas(250,250);

            //VRAAG DE GRAFISCHE CONTEXT OP
            gc = canvas.getGraphicsContext2D();

            //NU KUN JE TEKENEN MET BEHULP VAN GC
                //OM TE TEKENEN GEBRUIK JE BIJVOORBEELD: gc.strokeOval(50,50,50,50);
                //OM DAAR EEN KLEUR AAN TE GEVEN GEBRUIK JE: gc.setStroke(Color.RED);
    }

    private void addElements(GridPane pane)
    {
        //LABEL
        pane.add(titelLBL,1,1,4,1);
        pane.add(puntenInvoerLBL,1,2,2,1 );

        //TEXTFIELD
        pane.add(puntenInvoerTXT,3,2);
        puntenInvoerTXT.setPrefWidth(90);

        //BUTTON
        pane.add(duitslandBTN, 1,3);
        duitslandBTN.setPrefWidth(90);
        pane.add(engelandBTN,2,3);
        engelandBTN.setPrefWidth(90);
        pane.add(frankrijkBTN,3,3);
        frankrijkBTN.setPrefWidth(90);
        pane.add(nederlandBTN,4,3);
        nederlandBTN.setPrefWidth(90);

        //CANVAS
        pane.add(canvas,1,4,4,1);

        //PADDING
        pane.setVgap(5);
        pane.setHgap(5);
    }

    public void draw()
    {
        gc.clearRect(0,0,250,250);

        gc.fillText("Duitsland:", 0,20);
        gc.fillText("Engeland:",0,40);
        gc.fillText("Frankrijk:",0,60);
        gc.fillText("Nederland:",0,80);

        gc.strokeRect(90,10,duitsland.getPunten(),10);
        gc.strokeRect(90,30,engeland.getPunten(),10);
        gc.strokeRect(90,50,frankrijk.getPunten(),10);
        gc.strokeRect(90,70,nederland.getPunten(),10);
    }

    private void duitsland(){
        try
        {
            duitsland.setPunten(Integer.parseInt(puntenInvoerTXT.getText()));
            draw();
        }
        catch(NumberFormatException e)
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Er is een fout opgetreden");
            alert.setContentText("Voer een HEEL getal in");
            alert.showAndWait();
        }
    }

    private void engeland(){
        try
        {
            engeland.setPunten(Integer.parseInt(puntenInvoerTXT.getText()));
            draw();
        }
        catch(NumberFormatException e)
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Er is een fout opgetreden");
            alert.setContentText("Voer een HEEL getal in");
            alert.showAndWait();
        }
    }

    private void frankrijk(){
        try
        {
            frankrijk.setPunten(Integer.parseInt(puntenInvoerTXT.getText()));
            draw();
        }
        catch(NumberFormatException e)
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Er is een fout opgetreden");
            alert.setContentText("Voer een HEEL getal in");
            alert.showAndWait();
        }
    }
    private void nederland(){
        try
        {
            nederland.setPunten(Integer.parseInt(puntenInvoerTXT.getText()));
            draw();
        }
        catch(NumberFormatException e)
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Er is een fout opgetreden");
            alert.setContentText("Voer een HEEL getal in");
            alert.showAndWait();
        }
    }
}