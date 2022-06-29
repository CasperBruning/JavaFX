import java.util.ArrayList;

public class Client
{
	private String naam;
	private int patientnummer;
	private String telefoonnummer;
	private ArrayList<Afspraak> afsprakenList = new ArrayList<Afspraak>();
	public Client(String naam, String telefoonnummer, int patientnummer)
	{
		this.naam = naam;
		this.telefoonnummer = telefoonnummer;
		this.patientnummer = patientnummer;
	}

	public String getNaam()
	{
		return naam;
	}

	public void setNaam(String naam)
	{
		this.naam = naam;
	}

	public String getTelefoonnummer()
	{
		return telefoonnummer;
	}

	public void setTelefoonnummer(String telefoonnummer)
	{
		this.telefoonnummer = telefoonnummer;
	}

	public int getPatientnummer()
	{
		return patientnummer;
	}

	public String geefAfspraak()
	{
		String afspraken = "";
		for (Afspraak afspraak : afsprakenList)
		{
			afspraken = afspraak.getDag() +"-"+ afspraak.getMaand() +"-"+ afspraak.getJaar() + " " + afspraak.getUur() + ":" + afspraak.getMinuut() + "\n" +
					afspraak.getBehandeling() + "\n" + afspraken;


		}
		return afspraken;
	}

	public void voegAfspraak(int dag, int maand, int jaar, int uur, int minuut, String behandeling)
	{
		afsprakenList.add(new Afspraak(dag, maand, jaar, uur, minuut, behandeling));
	}

	@Override
	public String toString()
	{
		return naam + " (" + patientnummer + ")";
	}
}
