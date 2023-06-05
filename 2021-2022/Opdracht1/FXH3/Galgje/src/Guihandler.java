import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Guihandler
{
    private  TextField invoervak;
    private  Button button;
    private  Line longVerticalBeam, horizontalBeam, shortVerticalBeam, diagnolBeam, lichaam, armL, armR, beenL, beenR;
    private  Circle hoofd;
    private  Label h, a, l, o, uitkomstLabel, aantalPogingen;

    int counter = 6;

    public Guihandler(Pane pane)
    {
        drawGallow();
        drawPuppet();
        placeLetterLabels();
        placeInputButtonOutcomeAttempts();



        pane.getChildren().addAll(longVerticalBeam, horizontalBeam, shortVerticalBeam, diagnolBeam, invoervak, button, hoofd, lichaam, armL, armR, beenL, beenR, h,a,l,o, aantalPogingen, uitkomstLabel);

        button.setOnAction(event -> checkInput());
    }

    private void drawGallow()
    {
        //Galg
        longVerticalBeam = new Line(20,20,20,400);
        horizontalBeam = new Line(20,20,100,20);
        shortVerticalBeam = new Line(100,20,100,40);
        diagnolBeam = new Line(20,40,40,20);
    }

    private void drawPuppet()
    {
        //body puppet
        hoofd = new Circle(100, 50, 13);
        hoofd.setVisible(false);
        lichaam = new Line(100,60,100,100);
        lichaam.setVisible(false);
        armL = new Line(100,70, 70, 50);
        armL.setVisible(false);
        armR = new Line(100,70,130,50);
        armR.setVisible(false);
        beenL = new Line(100,100,70,130);
        beenL.setVisible(false);
        beenR = new Line(100,100,130,130);
        beenR.setVisible(false);
    }

    private void placeLetterLabels()
    {
        //labels voor letters
        h = new Label("*");
        a = new Label("*");
        l = new Label("* *");
        o = new Label("*");
        h.relocate(183,60);
        a.relocate(193,60);
        l.relocate(203,60);
        o.relocate(223,60);
    }

    private void placeInputButtonOutcomeAttempts()
    {
        //overig
        uitkomstLabel = new Label("");
        uitkomstLabel.relocate(183,100);
        aantalPogingen = new Label("Aantal pogingen: 6");
        aantalPogingen.relocate(183,80);
        invoervak = new TextField();
        invoervak.relocate(183, 20);
        button = new Button("Ok");
        button.relocate(150,20);
    }

    private void checkInput(){
        String inputString = invoervak.getText();

        if (inputString.contentEquals("h") || inputString.contentEquals("a") || inputString.contentEquals("l") || inputString.contentEquals("o"))
        {
            switch (inputString)
            {
                case "h": h.setText("h"); break;
                case "a": a.setText("a"); break;
                case "l": l.setText("l l"); break;
                case "o": o.setText("o"); break;
            }
            String controleOfWoordGeradenIs = h.getText() + a.getText() + l.getText() + o.getText();
            if (controleOfWoordGeradenIs.contentEquals("hal lo"))
            {
                uitkomstLabel.setText("U heeft het woord geraden!");
            }
        }
        else
                counter--;
                switch (counter)
                {
                    case 5: hoofd.setVisible(true); break;
                    case 4: lichaam.setVisible(true); break;
                    case 3: armL.setVisible(true); break;
                    case 2: armR.setVisible(true); break;
                    case 1: beenL.setVisible(true); break;
                    case 0: beenR.setVisible(true); break;
                }
                if (counter <= 0)
                {
                    uitkomstLabel.setText("U heeft verloren!");
                }
                aantalPogingen.setText("Aantal pogingen: " + counter);
        }
    }