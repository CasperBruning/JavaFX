public class Boek
{

    private String naam;
    private String schrijver;
    private int oplagen;

    public Boek(String naam, String schrijver, int oplagen)
    {
        this.naam = naam;
        this.schrijver = schrijver;
        this.oplagen = oplagen;
    }

    public String getNaam()
    {
        return naam;
    }

    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public String getSchrijver()
    {
        return schrijver;
    }

    public void setSchrijver(String schrijver)
    {
        this.schrijver = schrijver;
    }

    public int getOplagen()
    {
        return oplagen;
    }

    public void setOplagen(int oplagen)
    {
        this.oplagen = oplagen;
    }

    public String toString()
    {
        return naam + " = " + schrijver;
    }
}
