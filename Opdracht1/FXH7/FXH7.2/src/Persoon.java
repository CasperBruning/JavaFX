public class Persoon
{
    private String naam;
    private Datum gebDatum;

    public Persoon(String naam, Datum gebDatum)
    {
        this.naam = naam;
        this.gebDatum = gebDatum;
    }

    public String getNaam()
    {
        return naam;
    }

    public Datum getGebDatum()
    {
        return gebDatum;
    }

    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public String toString()
    {
        return "Naam: " + naam + "\n" + "\t \t" +"GeboorteDatum: " + gebDatum.getDatum();
    }
}
