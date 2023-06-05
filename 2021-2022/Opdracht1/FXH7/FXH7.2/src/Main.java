public class Main
{
    public static void main(String[] args)
    {
        Datum datum = new Datum(25,02,2005);
        Persoon persoon = new Persoon("Casper", datum);
        Boek boek = new Boek("Boek1", "123456789", persoon);

        System.out.println(boek.toString());

    }
}
