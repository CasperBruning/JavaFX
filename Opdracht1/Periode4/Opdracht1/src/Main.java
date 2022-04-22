public class Main
{
    public static void main(String[] args)
    {
        Schilderij nachtwacht = new Schilderij();

        nachtwacht.setTitel("De Nachtwacht");
        nachtwacht.setHoogte(3);
        nachtwacht.setBreedte(9);

        System.out.println("Titel: " + nachtwacht.getTitel() + "\n" +
                            "Hoogte: " + nachtwacht.getHoogte() + "\n" +
                            "Breedte: " + nachtwacht.getBreedte() + "\n" +
                            "Oppervlakte: " + nachtwacht.getOppervlak());
    }
}
