public class Bankrekening
{
    private final String rekeningnummer = "";
    private double saldo;

    public double getSaldo()
    {
        return saldo;
    }

    public void stort (double bedrag)
    {
        saldo += bedrag;
    }

    public double neemOp (double bedrag)
    {
        saldo -= bedrag;
        return bedrag;
    }

}
