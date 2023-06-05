import java.util.Random;

public class Dobbelsteen
{
    Random rand = new Random();


    public int returngooi()
    {
        return rand.nextInt(6) + 1;

    }
}
