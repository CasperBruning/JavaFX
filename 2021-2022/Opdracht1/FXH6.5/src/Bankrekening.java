import java.text.DecimalFormat;

public class Bankrekening
{
    DecimalFormat df = new DecimalFormat("0.00");
    private final String rekeningnummer = "";
    private double saldo;

    public double getSaldo()
    {
        return Double.parseDouble(df.format(saldo));
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
