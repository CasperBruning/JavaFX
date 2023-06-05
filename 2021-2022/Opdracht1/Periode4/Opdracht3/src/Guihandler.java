import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    private Label diameterLBL ,hoogteLBL, resultaatLBL;
    private TextField diameterTXT, hoogteTXT, resultaatTXT;
    private Button berekenBTN;
    private Label diameterLBL1 ,hoogteLBL1, resultaatLBL1;
    private TextField diameterTXT1, hoogteTXT1, resultaatTXT1;
    private Button berekenBTN1;

    Beker beker = new Beker();
    Beker beker1 = new Beker();
    public Guihandler(GridPane pane)
    {
        elements(pane);
        berekenBTN.setOnAction(event -> berekenInhoud());
        berekenBTN1.setOnAction(event -> berekenInhoud1());
    }

    private void berekenInhoud()
    {
        beker.setDiameter(Integer.parseInt(diameterTXT.getText()));
        beker.setHoogte(Integer.parseInt(hoogteTXT.getText()));
        resultaatTXT.setText(beker.getInhoud());
    }
    private void berekenInhoud1()
    {
        beker1.setDiameter(Integer.parseInt(diameterTXT1.getText()));
        beker1.setHoogte(Integer.parseInt(hoogteTXT1.getText()));
        resultaatTXT1.setText(beker1.getInhoud());
    }
    private void elements(GridPane pane)
    {
        initializeElements(pane);
        addElements(pane);
    }

    private void initializeElements(GridPane pane)
    {
        //LABEL
        diameterLBL = new Label("Diameter:");
        hoogteLBL = new Label("Hoogte:");
        resultaatLBL = new Label("Resultaat:");

        //TEXTFIELD
        diameterTXT = new TextField();
        hoogteTXT = new TextField();
        resultaatTXT = new TextField();

        //BUTTON
        berekenBTN = new Button("Bereken");

        //LABEL1
        diameterLBL1 = new Label("Diameter:");
        hoogteLBL1 = new Label("Hoogte:");
        resultaatLBL1 = new Label("Resultaat:");

        //TEXTFIELD1
        diameterTXT1 = new TextField();
        hoogteTXT1 = new TextField();
        resultaatTXT1 = new TextField();

        //BUTTON1
        berekenBTN1 = new Button("Bereken");
    }

    private void addElements(GridPane pane)
    {
        //LABEL
        pane.add(diameterLBL ,1,1);
        pane.add(hoogteLBL ,1,2);
        pane.add(resultaatLBL ,1,4);

        //TEXTFIELD
        pane.add(diameterTXT,2,1);
        pane.add(hoogteTXT,2,2);
        pane.add(resultaatTXT,2,4);

        //BUTTON
        pane.add(berekenBTN,2,3);

        //LABEL
        pane.add(diameterLBL1 ,4,1);
        pane.add(hoogteLBL1 ,4,2);
        pane.add(resultaatLBL1 ,4,4);

        //TEXTFIELD
        pane.add(diameterTXT1,5,1);
        pane.add(hoogteTXT1,5,2);
        pane.add(resultaatTXT1,5,4);

        //BUTTON
        pane.add(berekenBTN1,5,3);

        //PADDING
        pane.setVgap(5);
        pane.setHgap(5);

    }

}