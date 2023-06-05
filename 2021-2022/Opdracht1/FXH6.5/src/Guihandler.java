import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Guihandler
{
    Bankrekening rekening = new Bankrekening();
    private Label bedragLBL, saldoLBL;
    private TextField bedragTXT, saldoTXT;
    private Button stortBTN, neemOpBTN;

    public Guihandler(GridPane pane)
    {
        elements(pane);
    }

    private void elements(GridPane pane)
    {
        initializeElements(pane);
        addElements(pane);
        saldoTXT.setText(String.valueOf(rekening.getSaldo()));

        stortBTN.setOnAction(event -> stortBedrag());
        neemOpBTN.setOnAction(event -> neemOpBedrag());
    }
    private void neemOpBedrag()
    {
        try{
            rekening.neemOp(Double.parseDouble(bedragTXT.getText()));
            saldoTXT.setText(String.valueOf(rekening.getSaldo()));
        } catch (NumberFormatException e)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Voer een geldig bedrag in");
            alert.setHeaderText("Voer een . in ipv ,");
            alert.showAndWait();
        } catch (Exception e)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Onbekende Fout");
            alert.setHeaderText("Er is een onbekende fout opgetreden");
            alert.showAndWait();
        }
    }

    private void stortBedrag()
    {
        try{
            rekening.stort(Double.parseDouble(bedragTXT.getText()));
            saldoTXT.setText(String.valueOf(rekening.getSaldo()));
        } catch (NumberFormatException e)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Voer een geldig bedrag in");
            alert.setHeaderText("Voer een . in ipv ,");
            alert.showAndWait();
        } catch (Exception e)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Onbekende Fout");
            alert.setHeaderText("Er is een onbekende fout opgetreden");
            alert.showAndWait();
        }
    }

    private void initializeElements(GridPane pane)
    {
        //LABEL
        bedragLBL = new Label("Bedrag: ");
        saldoLBL = new Label("Saldo: ");

        //TEXTFIELD
        bedragTXT = new TextField();
        saldoTXT = new TextField();

        //BUTTON
        stortBTN = new Button("Stort");
        neemOpBTN = new Button("Neem Op");
    }

    private void addElements(GridPane pane)
    {
        //LABEL
        pane.add(bedragLBL,1,1);
        pane.add(saldoLBL,1,3);

        //TEXTFIELD
        pane.add(bedragTXT,2,1);
        pane.add(saldoTXT,2,3);

        //BUTTON
        pane.add(stortBTN, 1,2);
        pane.add(neemOpBTN, 2,2);

        //PADDING
        pane.setVgap(5);
        pane.setHgap(5);
    }
}