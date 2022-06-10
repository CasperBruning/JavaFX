import java.util.ArrayList;

public class Voorraad
{
    ArrayList<Artikel> artikelen;
    public Voorraad(){
        artikelen = new ArrayList<Artikel>();

        Artikel artikel = new Artikel("appel", 5, 1.99);
        artikelen.add(artikel);
        artikel = new Artikel("peer", 2, 4.99);
        artikelen.add(artikel);
        artikel = new Artikel("banaan", 8, 2.99);
        artikelen.add(artikel);
        artikel = new Artikel("perzik", 3, 0.99);
        artikelen.add(artikel);

    }

    public void addArtikel(Artikel artikel){
        artikelen.add(artikel);
    }

    public ArrayList<Artikel> getArtikelen(){
        return artikelen;
    }
}
