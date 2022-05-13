import java.util.ArrayList;

public class Wedstrijd
{
    private String tijd;
    private String Veld;
    ArrayList<Scheidsrechter> scheidsrechterList = new ArrayList<>();

    public void addScheidsrechter(Scheidsrechter scheidsrechter){
        scheidsrechterList.add(scheidsrechter);
    }

    public void print(){
        System.out.println("scheidsrechter" + scheidsrechterList);

    }

}
