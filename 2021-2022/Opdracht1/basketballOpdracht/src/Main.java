public class Main
{
    public static void main(String[] args)
    {
        Scheidsrechter scheidsrechter1 = new Scheidsrechter();
        Scheidsrechter scheidsrechter2 = new Scheidsrechter();

        scheidsrechter1.setNaam("jan");
        scheidsrechter1.setTelefoonnummer("12345");
        scheidsrechter2.setNaam("han");
        scheidsrechter2.setTelefoonnummer("098765");

        Wedstrijd wedstrijd = new Wedstrijd();

        wedstrijd.addScheidsrechter(scheidsrechter1);
        wedstrijd.addScheidsrechter(scheidsrechter2);

        wedstrijd.print();
    }
}
