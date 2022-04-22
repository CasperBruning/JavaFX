import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    private TextField inputField;
    private Button een, twee, drie, vier, vijf, zes, zeven, acht, negen, nul, plus, min, is;
    private Label uitkomst;
    int operatorUsed = 0;
    String first = "";
    String second = "";

    public Guihandler(GridPane pane)
    {
        createElements(pane);
    }

    private void createElements(GridPane pane)
    {
        initializeElements();
        addElements(pane);
        een.setOnAction(event -> knopEen());
        twee.setOnAction(event -> knopTwee());
        drie.setOnAction(event -> knopDrie());
        vier.setOnAction(event -> knopVier());
        vijf.setOnAction(event -> knopVijf());
        zes.setOnAction(event -> knopZes());
        zeven.setOnAction(event -> knopZeven());
        acht.setOnAction(event -> knopAcht());
        negen.setOnAction(event -> knopNegen());
        nul.setOnAction(event -> knopNul());
        plus.setOnAction(event -> knopPlus());
        min.setOnAction(event -> knopMin());
        is.setOnAction(event -> knopIs());

    }
    public void knopIs()
    {
        double getal1 = Double.parseDouble(first);
        double getal2 = Double.parseDouble(second);

        if (operatorUsed == 1)
        {
            Double berekening = getal1 + getal2;
            String uitkomst = String.valueOf(berekening);

        } else if (operatorUsed == 2)
        {
            Double berekening = getal1 - getal2;
            String uitkomst = String.valueOf(berekening);
//            uitkomst.setText(uitkomst);
        } else {
            uitkomst.setText("Syntax Error");
        }

    }

    public void knopPlus()
    {

        String operator = "+";
        inputField.setText(inputField.getText() + operator);
        operatorUsed = 1;
    }
    public void knopMin()
    {
        String operator = "-";
        inputField.setText(inputField.getText() + operator);
        operatorUsed = 2;
    }
    public void knopNul()
    {

        String number = "0";
        inputField.setText(inputField.getText() + number);
        if (operatorUsed == 0){
            first += number;
        } else if (operatorUsed == 1 || operatorUsed == 2)
        {
            second+= number;
        }
    }

    public void knopEen()
    {
        String number = "1";
        inputField.setText(inputField.getText() + number);
        if (operatorUsed == 0){
            first += number;
        } else if (operatorUsed == 1 || operatorUsed == 2)
        {
            second+= number;
        }
    }
    public void knopTwee()
    {
        String number = "2";
        inputField.setText(inputField.getText() + number);
        if (operatorUsed == 0){
            first += number;
        } else if (operatorUsed == 1 || operatorUsed == 2)
        {
            second+= number;
        }
    }
    public void knopDrie()
    {
        String number = "3";
        inputField.setText(inputField.getText() + number);
        if (operatorUsed == 0){
            first += number;
        } else if (operatorUsed == 1 || operatorUsed == 2)
        {
            second+= number;
        }
    }
    public void knopVier()
    {
        String number = "4";
        inputField.setText(inputField.getText() + number);
        if (operatorUsed == 0){
            first += number;
        } else if (operatorUsed == 1 || operatorUsed == 2)
        {
            second+= number;
        }
    }
    public void knopVijf()
    {
        String number = "5";
        inputField.setText(inputField.getText() + number);
        if (operatorUsed == 0){
            first += number;
        } else if (operatorUsed == 1 || operatorUsed == 2)
        {
            second+= number;
        }
    }
    public void knopZes()
    {
        String number = "6";
        inputField.setText(inputField.getText() + number);
        if (operatorUsed == 0){
            first += number;
        } else if (operatorUsed == 1 || operatorUsed == 2)
        {
            second+= number;
        }
    }
    public void knopZeven()
    {
        String number = "7";
        inputField.setText(inputField.getText() + number);
        if (operatorUsed == 0){
            first += number;
        } else if (operatorUsed == 1 || operatorUsed == 2)
        {
            second+= number;
        }
    }
    public void knopAcht()
    {
        String number = "8";
        inputField.setText(inputField.getText() + number);
        if (operatorUsed == 0){
            first += number;
        } else if (operatorUsed == 1 || operatorUsed == 2)
        {
            second+= number;
        }
    }
    public void knopNegen()
    {
        String number = "9";
        inputField.setText(inputField.getText() + number);
        if (operatorUsed == 0){
            first += number;
        } else if (operatorUsed == 1 || operatorUsed == 2)
        {
            second+= number;
        }
    }

    private void addElements(GridPane pane)
    {
        //textfield
        pane.add(inputField,0,0,5,1);

        //buttons
        pane.add(een,1,1);
        pane.add(twee,2,1);
        pane.add(drie,3,1);
        pane.add(plus,4,1);
        pane.add(vier,1,2);
        pane.add(vijf,2,2);
        pane.add(zes,3,2);
        pane.add(min,4,2);
        pane.add(zeven,1,3);
        pane.add(acht,2,3);
        pane.add(negen,3,3);
        pane.add(is,4,3,1,2);
        pane.add(nul,2,4);
        pane.add(uitkomst,1,6);

        //padding
        pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(5);
        pane.setHgap(5);

    }

    private void initializeElements()
    {
        //textfield
        inputField = new TextField();

        //buttons
        een = new Button("1");
        twee = new Button("2");
        drie = new Button("3");
        vier = new Button("4");
        vijf = new Button("5");
        zes = new Button("6");
        zeven = new Button("7");
        acht = new Button("8");
        negen = new Button("9");
        nul = new Button("0");
        plus = new Button("+");
        min = new Button("-");
        is = new Button("=");

        //label
        uitkomst = new Label();
    }
}