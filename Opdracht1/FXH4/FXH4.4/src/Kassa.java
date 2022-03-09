import java.text.DecimalFormat;

public class Kassa
{
    private double subtotaal;
    private final double PERCENTAGE_BTW = 21.0;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public void telOp(double bedrag)
    {
        subtotaal += bedrag;
    }

    public double getSubtotaal()
    {
        return Double.parseDouble(df.format(subtotaal));
    }

    public void reset()
    {
        subtotaal = 0.00;
    }

    public double berekenBTW()
    {
        return Double.parseDouble(df.format(subtotaal - berekenSubtotaalExBTW()));
    }

    public double berekenSubtotaalExBTW()
    {
        return Double.parseDouble(df.format(subtotaal / (1 + PERCENTAGE_BTW / 100)));
    }
}
