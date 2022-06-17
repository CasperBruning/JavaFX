import java.util.ArrayList;

public class Garage
{
    private ArrayList<Auto> autolijst = new ArrayList<Auto>();

    public ArrayList<Auto> returnAuto(){
        return autolijst;
    }

    public void maakAuto(){
        Auto auto = new Auto("Personenwagen", "Volkswagen","Polo",80, "Benzine");
        auto = new Auto("Personenwagen", "Mercedes","A45",130, "Benzine");
        auto = new Auto("Personenwagen", "Toyota","Avensis",115, "LPG");
        auto = new Auto("Personenwagen", "Ford","Fiesta",95, "Benzine");
        auto = new Auto("Personenwagen", "peugot","308",90, "Diesel");
    }
}
