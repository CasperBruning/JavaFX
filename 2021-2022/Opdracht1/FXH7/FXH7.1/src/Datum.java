public class Datum
{
    private int dag;
    private int maand;
    private int jaar;

    public Datum(int dag, int maand, int jaar)
    {
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }

    //GETTERS
    public int getDag()
    {
        return dag;
    }

    public int getMaand()
    {
        return maand;
    }

    public int getJaar()
    {
        return jaar;
    }

    public String getDatum(){
        return dag + "-" + maand + "-" + jaar;
    }

    //SETTERS
    public void setDag(int dag)
    {
        this.dag = dag;
    }

    public void setMaand(int maand)
    {
        this.maand = maand;
    }

    public void setJaar(int jaar)
    {
        this.jaar = jaar;
    }
}
