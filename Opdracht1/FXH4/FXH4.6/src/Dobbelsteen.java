import java.util.Random;

public class Dobbelsteen
{
    Random rand = new Random();
    private int number = 0;

    public int returngooi()
    {
        int randomNumber = rand.nextInt(6) + 1;
        this.number = randomNumber;
        return randomNumber;
    }

    public int checkSix()
    {
        int thrownSix = 0;

        if (number==6)
        {
            thrownSix += 1;
        }
        
        return thrownSix;
    }

}
