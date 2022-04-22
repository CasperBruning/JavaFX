public class Landen
{
    private String landNaam = "";
    private int aantalPunten = 0;

    public Landen(String landNaam)
    {
        this.landNaam = landNaam;
    }

    public void setPunten(int aantalPunten)
    {
        this.aantalPunten += aantalPunten;
    }

    public int getPunten()
    {
        return aantalPunten;
    }
}
