import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.collections.FXCollections;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class GuiHandler
{
	private final GridPane root;
	private ArrayList<Client> clienten = new ArrayList<Client>();
	private ComboBox<Client> comboboxClienten = new ComboBox<Client>();
	private Label lblSelectie, lblNaamNummer, lblTelefoonnummer, lblDatum, lblTijd, lblError, lblNieuweAfspraak,
			lblAfspraken;
	private TextField txtDag, txtMaand, txtJaar, txtUur, txtMinuut, txtBehandeling;

	private final TextArea afsprakenArea = new TextArea();
	private final Button btnVoegToe;

	public GuiHandler(GridPane root)
	{
		this.root = root;
		this.root.setVgap(5);
		this.root.setHgap(5);
		this.root.setPadding(new Insets(5));

		vulClienten();
		bindClienten(comboboxClienten);
		comboboxClienten.setOnAction(event -> selecteerClient());

		lblSelectie = new Label("Selecteer client");
		lblNaamNummer = new Label();
		lblNaamNummer.setFont(Font.font("Verdana", 20));
		lblTelefoonnummer = new Label();
		lblTelefoonnummer.setFont(Font.font("Verdana", 20));

		creeerAfspraakvelden();

		btnVoegToe = new Button("Voeg afspraak toe");
		btnVoegToe.setOnAction(event -> voegAfspraakToe());
		btnVoegToe.setMinWidth(250);

		afsprakenArea.setMaxWidth(250);
		afsprakenArea.setEditable(false);

		lblError = new Label();
		lblError.setTextFill(Color.RED);

		this.root.add(lblSelectie, 0, 0);
		this.root.add(comboboxClienten, 1, 0, 3, 1);
		this.root.add(lblNaamNummer, 0, 1, 5, 1);
		this.root.add(lblTelefoonnummer, 0, 2, 5, 1);
		this.root.add(lblNieuweAfspraak, 0, 3, 2, 1);
		this.root.add(lblDatum, 0, 4);
		this.root.add(txtDag, 1, 4);
		this.root.add(txtMaand, 2, 4);
		this.root.add(txtJaar, 3, 4);
		this.root.add(lblTijd, 0, 5);
		this.root.add(txtUur, 1, 5);
		this.root.add(txtMinuut, 2, 5);
		this.root.add(txtBehandeling, 0, 6, 4, 1);
		this.root.add(btnVoegToe, 0, 7, 5, 1);
		this.root.add(lblError, 0, 8, 5, 1);
		this.root.add(lblAfspraken, 0, 9, 4, 1);
		this.root.add(afsprakenArea,0, 10, 4,1);

	}

	/**
	 * Alle afspraakvelden worden hiermee gemaakt en gevuld
	 */
	private void creeerAfspraakvelden()
	{
		lblNieuweAfspraak = new Label("Nieuwe afspraak");
		lblAfspraken = new Label("Afspraken");
		lblDatum = new Label("Datum:");
		lblTijd = new Label("Tijd");
		txtDag = new TextField();
		txtDag.setPromptText("1");
		txtDag.setMaxWidth(40);
		txtMaand = new TextField();
		txtMaand.setPromptText("1");
		txtMaand.setMaxWidth(40);
		txtJaar = new TextField();
		txtJaar.setPromptText("2022");
		txtJaar.setMaxWidth(80);
		txtUur = new TextField();
		txtUur.setPromptText("12");
		txtUur.setMaxWidth(40);
		txtMinuut = new TextField();
		txtMinuut.setPromptText("00");
		txtMinuut.setMaxWidth(40);
		txtBehandeling = new TextField();
		txtBehandeling.setPromptText("Behandeling...");

	}

	/**
	 * methode welke wordt aangeroepen als op de knop toevoegen wordt geklikt De
	 * afspraak wordt aan de geselecteerde client toegevoegd
	 */
	private void voegAfspraakToe()
	{
		lblError.setText("");
		lblError.setTextFill(Color.RED);
		Client eenClient = comboboxClienten.getValue();

		int dag = 0;
		int maand = 0;
		int jaar = 0;
		int uur = 0;
		int minuut = 0;
		String behandeling = "";

		try
		{
			dag = Integer.parseInt(txtDag.getText());
			maand = Integer.parseInt(txtMaand.getText());
			jaar = Integer.parseInt(txtJaar.getText());
			uur = Integer.parseInt(txtUur.getText());
			minuut = Integer.parseInt(txtMinuut.getText());
			behandeling = txtBehandeling.getText();
		}
		catch (NumberFormatException e)
		{
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Fout");
			alert.setHeaderText("Er is iets misgegaan");
			if (txtDag.getText().equals("") || txtMaand.getText().equals("") || txtJaar.getText().equals("") || txtUur.getText().equals("") || txtMinuut.getText().equals("") || txtBehandeling.getText().equals(""))
			{
				alert.setContentText("Zorg ervoor dat alle velden gevulld zijn");
			} else {
				alert.setContentText("Zorg ervoor dat alle datum velden getallen zijn");
			}
			alert.showAndWait();
		}
		catch (Exception e){
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Error");
			alert.setContentText("Er is iets fout gegaan, controleer de ingevoerde gegevens");
			alert.showAndWait();
		}
		if (dag > 31 || dag < 1)
		{
			lblError.setText("Dag moet minimaal 1 en maximaal 31 zijn");
		}
		else if (maand < 1 || maand > 12)
		{
			lblError.setText("Maand moet minimaal 1 en maximaal 12 zijn");
		}
		else if (jaar < 2022)
		{
			lblError.setText("Jaar moet 2022 of hoger zijn");
		}
		else if (uur < 0 || uur > 23)
		{
			lblError.setText("Uur moet minimaal 0 en maximaal 23 zijn");
		}
		else if (minuut < 0 || minuut > 59)
		{
			lblError.setText("Minuut moet minimaal 0 en maximaal 59 zijn");
		} else {
			eenClient.voegAfspraak(dag, maand, jaar, uur, minuut,behandeling);
			lblError.setTextFill(Color.GREEN);
			lblError.setText("Afspraak toegevoegd");

			afsprakenArea.setText(eenClient.geefAfspraak());
		}



	}

	/**
	 * Zorgt ervoor dat de geselecteerde client gepresenteerd wordt.
	 */
	private void selecteerClient()
	{
		Client eenClient = comboboxClienten.getValue();
		lblNaamNummer.setText(eenClient.toString());
		lblTelefoonnummer.setText(eenClient.getTelefoonnummer());

		afsprakenArea.setText(eenClient.geefAfspraak());

	}

	/**
	 * Vult de klantenlijst
	 */
	private void vulClienten()
	{
		clienten.add(new Client("Meneer De Vries", "0612345678", 1));
		clienten.add(new Client("Mevrouw Jansen", "0664453312", 2));
		clienten.add(new Client("Familie Hannink", "0695873846", 3));
		clienten.add(new Client("Mevrouw Reesink", "0697987943", 4));
		clienten.add(new Client("Familie Klein Hesselink", "0687648746", 5));
	}

	/**
	 * Zorgt ervoor dat de clienten op de combobox zichtbaar zijn.
	 * 
	 * @param comboClienten de combobox welke gebruikt moet worden.
	 */
	private void bindClienten(ComboBox<Client> comboClienten)
	{
		ObservableList<Client> clientenLijst = FXCollections.observableArrayList(clienten);
		comboClienten.setItems(clientenLijst);
	}
}
