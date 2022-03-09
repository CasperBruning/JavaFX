import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    private final CheckBox ja , nee , jaFilm, neeFilm, keuzeNee;
    private final Label disclaimer ,afspreken, outcome, film, emptySpaceOutcome , empty, empty2, ietsanders;
    private final TextField keuzeIetsAnders;
    private final Button send;


    public Guihandler(GridPane pane)
    {
        disclaimer = new Label("DISCLAIMER: er zitten veel bugs in dit programma.");
        empty = new Label();
        empty2 = new Label();
        afspreken = new Label("Wil je binnenkort wat doen als afleiding?");
        ja = new CheckBox("Ja");
        nee = new CheckBox("Nee");
        outcome = new Label("Uitkomst: nog geen uitkomst");
        emptySpaceOutcome = new Label();
        jaFilm = new CheckBox("Ja");
        neeFilm = new CheckBox("Nee");
        film = new Label("Wil je een film kijken?");
        ietsanders = new Label("Wil je iets anders doen? zo ja vul het hieronder in");
        keuzeIetsAnders = new TextField();
        keuzeNee = new CheckBox("Nee");
        send = new Button("Verzend antwoord");

        pane.add(afspreken,0,0);
        pane.add(ja,0,1);
        pane.add(nee, 0,2);

        ja.setOnAction(event -> {
            nee.setSelected(false);
            pane.add(empty,0,3);
            pane.add(film,0,4);
            pane.add(jaFilm,0,5);
            pane.add(neeFilm,0,6);
            pane.add(emptySpaceOutcome,0,99);
            pane.add(outcome,0,100);
            pane.add(disclaimer,0,101);

            jaFilm.setOnAction(event1 -> {
                neeFilm.setSelected(false);
                setPositiveOutcomeMetFilm();
            });

            neeFilm.setOnAction(event2 -> {
                jaFilm.setSelected(false);
                pane.add(empty2,0,7);
                pane.add(ietsanders,0,8);
                pane.add(keuzeIetsAnders,0,9);
                pane.add(send,1,9);
                pane.add(keuzeNee,0,10);

                send.setOnAction(event3 -> {
                    setPostiveOutcomeAndereKeuze();
                });

                keuzeNee.setOnAction(event4 -> {
                    setPositiveOutcomeGeenPlan();
                });
            });
        });

//        nee.setOnAction(event -> {
//            ja.setSelected(false);
//            setNegativeOutcome();
//            pane.add(emptySpaceOutcome,0,99);
//            pane.add(outcome,0,100);
//            pane.add(disclaimer,0,101);
//
//        });

        nee.setOnAction(event -> {
            pane.add(emptySpaceOutcome,0,99);
            pane.add(disclaimer,0,101);
            ja.setSelected(false);
            nee.setSelected(false);

        });


    }

    public void setPostiveOutcomeAndereKeuze() {
        outcome.setText("Uitkomst: Happy Casper die " + keuzeIetsAnders.getText() + " met Anne gaat doen" + "\n" + "Casper is te dom om dit naar een API te sturen dus verstuur even een foto van het programma");
    }

    public void setPositiveOutcomeMetFilm() {
        outcome.setText("Uitkomst: Happy Casper die een film met Anne gaat kijken" + "\n" + "Casper is te dom om dit naar een API te sturen dus verstuur even een foto van het programma");
    }

    public void setPositiveOutcomeGeenPlan(){
        outcome.setText("Uitkomst: Happy Casper die nog niet weet wat hij met Anne gaat doen " + "\n" + "Casper is te dom om dit naar een API te sturen dus verstuur even een foto van het programma");
    }

    public void setNegativeOutcome(){
        outcome.setText("Drankvoorraad === LEEG" + "\n" + "Casper is te dom om dit naar een API te sturen dus verstuur even een foto van het programma");
    }

}