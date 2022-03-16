import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    private Label inputLBL, outputLBL;
    private TextField inputTXT;
    private Button knopje;

    public Guihandler(GridPane pane)
    {
        createElements(pane);
        knopje.setOnAction(event -> action());
    }

    public void action()
    {
        try
        {
            int getal = Integer.parseInt(inputTXT.getText());
            if (getal < 0 || getal > 10){
                outputLBL.setText("Voer een getal binnen de 0 en de 10 in");
            }
            else
            {
                outputLBL.setText("Dat heb je goed gedaan");
            }
        }
        catch(NumberFormatException e)
        {
            outputLBL.setText("Voer een heel getal in binnen de 0 en de 10");
        }
        catch (Exception e)
        {
            outputLBL.setText("Er is iets fout gegaan");
        }
    }
    private void createElements(GridPane pane)
    {
        inputLBL = new Label("Voer een getal binnen de 0 en de 10 in: ");
        outputLBL = new Label("Output: ");
        inputTXT = new TextField();
        knopje = new Button("Knopje");

        pane.add(inputLBL,1,1);
        pane.add(inputTXT,2,1);
        pane.add(outputLBL,1,3);
        pane.add(knopje,1,2);
    }
}