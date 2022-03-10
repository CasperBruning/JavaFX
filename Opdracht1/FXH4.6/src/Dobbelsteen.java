import java.util.Random;

public class Dobbelsteen
{
    Random rand = new Random();
    int randomNumber = rand.nextInt(6) + 1;

    public int returngooi()
    {
        return randomNumber;
    }

    public int checkSix()
    {
        int thrownSix = 0;

        if (randomNumber==6)
        {
            thrownSix += 1;
        }
        
        return thrownSix;
    }

}
