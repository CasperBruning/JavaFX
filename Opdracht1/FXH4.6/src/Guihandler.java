import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;

public class Guihandler
{
    private Circle een,twee,drie,vier,vijf,zes,midden;
    private Circle eentwee,tweetwee,drietwee,viertwee,vijftwee,zestwee,middentwee;
    private Button gooi;
    private Label tussenmuur1, tussenmuur2, tussenmuur3, uitkomst, aantalGegooideZessen;
    private int aantalZessenGegooid = 0;
    public Guihandler(GridPane pane)
    {
        createElements(pane);

        Dobbelsteen dobbelsteen1 = new Dobbelsteen();
        Dobbelsteen dobbelsteen2 = new Dobbelsteen();


        gooi.setOnAction(event -> setEyes(dobbelsteen1.returngooi(), dobbelsteen1.checkSix(), dobbelsteen2.returngooi(), dobbelsteen2.checkSix()));
    }

    public void setEyes(int number,int checkSix ,int number2, int checkSix2)
    {
        setEyesInvisible();
        switch (number){
            case 1: midden.setVisible(true);
                break;
            case 2: een.setVisible(true);
                zes.setVisible(true);
                break;
            case 3: een.setVisible(true);
                zes.setVisible(true);
                midden.setVisible(true);
                break;
            case 4: een.setVisible(true);
                twee.setVisible(true);
                vijf.setVisible(true);
                zes.setVisible(true);
                break;
            case 5: een.setVisible(true);
                twee.setVisible(true);
                midden.setVisible(true);
                vijf.setVisible(true);
                zes.setVisible(true);
                break;
            case 6: een.setVisible(true);
                twee.setVisible(true);
                drie.setVisible(true);
                vier.setVisible(true);
                vijf.setVisible(true);
                zes.setVisible(true);
                break;
        }
        switch (number2){
            case 1: middentwee.setVisible(true);
                break;
            case 2: eentwee.setVisible(true);
                zestwee.setVisible(true);
                break;
            case 3: eentwee.setVisible(true);
                zestwee.setVisible(true);
                middentwee.setVisible(true);
                break;
            case 4: eentwee.setVisible(true);
                tweetwee.setVisible(true);
                vijftwee.setVisible(true);
                zestwee.setVisible(true);
                break;
            case 5: eentwee.setVisible(true);
                tweetwee.setVisible(true);
                middentwee.setVisible(true);
                vijftwee.setVisible(true);
                zestwee.setVisible(true);
                break;
            case 6: eentwee.setVisible(true);
                tweetwee.setVisible(true);
                drietwee.setVisible(true);
                viertwee.setVisible(true);
                vijftwee.setVisible(true);
                zestwee.setVisible(true);
                break;
        }
        //setUitkomst
        uitkomst.setText("Uitkomst: " + (number + number2));

        aantalZessenGegooid+= checkSix + checkSix2;
        aantalGegooideZessen.setText("Aantal gegooide zessen: " + aantalZessenGegooid);


    }


    private void setEyesInvisible()
    {
        een.setVisible(false);
        twee.setVisible(false);
        drie.setVisible(false);
        vier.setVisible(false);
        vijf.setVisible(false);
        zes.setVisible(false);
        midden.setVisible(false);

        eentwee.setVisible(false);
        tweetwee.setVisible(false);
        drietwee.setVisible(false);
        viertwee.setVisible(false);
        vijftwee.setVisible(false);
        zestwee.setVisible(false);
        middentwee.setVisible(false);
    }


    private void createElements(GridPane pane)
    {
        initializeElements();
        addElements(pane);

        //opmaak
        pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(5);
        pane.setVgap(5);
    }


    private void initializeElements()
    {
        //dobbelsteen1
        een = new Circle(10);
        twee = new Circle(10);
        drie = new Circle(10);
        vier = new Circle(10);
        vijf = new Circle(10);
        zes = new Circle(10);
        midden = new Circle(10);

        //dobbelsteen2
        eentwee = new Circle(10);
        tweetwee = new Circle(10);
        drietwee = new Circle(10);
        viertwee = new Circle(10);
        vijftwee = new Circle(10);
        zestwee = new Circle(10);
        middentwee = new Circle(10);

        //tussenmuurLabel
        tussenmuur1 = new Label("    ");
        tussenmuur2 = new Label("    ");
        tussenmuur3 = new Label("    ");

        //uitkomst
        uitkomst = new Label("Uitkomst: ");
        aantalGegooideZessen = new Label("Aantal gegooide zessen: ");

        //knop
        gooi = new Button("Gooi");

    }


    private void addElements(GridPane pane)
    {
        //dobbelsteen1
        pane.add(een,1,1);
        pane.add(twee,3,1);
        pane.add(drie,1,2);
        pane.add(vier,3,2);
        pane.add(vijf, 1, 3);
        pane.add(zes,3,3);
        pane.add(midden, 2,2);
        pane.add(gooi,1,5, 3,1);

        //dobbelsteen2
        pane.add(eentwee,5,1);
        pane.add(tweetwee,8,1);
        pane.add(drietwee,5,2);
        pane.add(viertwee,8,2);
        pane.add(vijftwee, 5, 3);
        pane.add(zestwee,8,3);
        pane.add(middentwee, 7,2);

        //tussenmuurLabel
        pane.add(tussenmuur1,4,1);
        pane.add(tussenmuur2,4,2);
        pane.add(tussenmuur3,4,3);

        //uitkomst
        pane.add(uitkomst, 4,5,5,1);
        pane.add(aantalGegooideZessen, 4,6,5,1);


        //knop
//        pane.add(gooi,1,5, 3,1);
    }

}


