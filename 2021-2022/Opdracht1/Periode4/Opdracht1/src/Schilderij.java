public class Schilderij
{
    private String titel;
    private double hoogte;
    private double breedte;

    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    public void setHoogte(double hoogte)
    {
        this.hoogte = hoogte;
    }

    public void setBreedte(double breedte)
    {
        this.breedte = breedte;
    }

    public String getTitel()
    {
        return titel;
    }

    public double getHoogte()
    {
        return hoogte;
    }

    public double getOppervlak()
    {
        return getHoogte() * getBreedte();
    }

    public double getBreedte()
    {
        return breedte;
    }


}
