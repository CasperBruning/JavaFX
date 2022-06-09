public class main
{
    public static void main(String[] args)
    {
        Datum datum = new Datum(25,02,2005);
        Persoon persoon = new Persoon("Casper", datum);

        Datum datum1 = new Datum(23,05,2006);
        Persoon persoon1 = new Persoon("Jan", datum1);

        System.out.println(persoon.toString());
        System.out.println(persoon1.toString());

    }
}
