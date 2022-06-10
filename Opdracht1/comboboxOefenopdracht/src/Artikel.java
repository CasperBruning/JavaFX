public class Artikel
{
    private String artikelNaam;
    private int artikelAantal;
    private double artikelPrijs;

    public Artikel(String artikelNaam, int artikelAantal, double artikelPrijs){
        this.artikelNaam = artikelNaam;
        this.artikelAantal = artikelAantal;
        this.artikelPrijs = artikelPrijs;
    }

    public String getArtikelNaam()
    {
        return artikelNaam;
    }

    public void setArtikelNaam(String artikelNaam)
    {
        this.artikelNaam = artikelNaam;
    }

    public int getArtikelAantal()
    {
        return artikelAantal;
    }

    public void setArtikelAantal(int artikelAantal)
    {
        this.artikelAantal = artikelAantal;
    }

    public double getArtikelPrijs()
    {
        return artikelPrijs;
    }

    public void setArtikelPrijs(float artikelPrijs)
    {
        this.artikelPrijs = artikelPrijs;
    }

    public String toString(){
        return artikelNaam;
    }
}
