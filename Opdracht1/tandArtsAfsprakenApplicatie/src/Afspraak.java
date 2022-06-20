public class Afspraak
{
    private int dag;
    private int maand;
    private int jaar;
    private int uur;
    private int minuut;
    private String behandeling;

    public Afspraak(int dag, int maand, int jaar, int uur, int minuut, String behandeling)
    {
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
        this.uur = uur;
        this.minuut = minuut;
        this.behandeling = behandeling;
    }

    public int getDag()
    {
        return dag;
    }

    public void setDag(int dag)
    {
        this.dag = dag;
    }

    public int getMaand()
    {
        return maand;
    }

    public void setMaand(int maand)
    {
        this.maand = maand;
    }

    public int getJaar()
    {
        return jaar;
    }

    public void setJaar(int jaar)
    {
        this.jaar = jaar;
    }

    public int getUur()
    {
        return uur;
    }

    public void setUur(int uur)
    {
        this.uur = uur;
    }

    public int getMinuut()
    {
        return minuut;
    }

    public void setMinuut(int minuut)
    {
        this.minuut = minuut;
    }

    public String getBehandeling()
    {
        return behandeling;
    }

    public void setBehandeling(String behandeling)
    {
        this.behandeling = behandeling;
    }
}
