import java.text.DecimalFormat;

public class Beker
{
    private int diameter;
    private int hoogte;

    public void setDiameter(int diameter)
    {
        this.diameter = diameter;
    }

    public void setHoogte(int hoogte)
    {
        this.hoogte = hoogte;
    }

    public int getDiameter()
    {
        return diameter;
    }

    public int getHoogte()
    {
        return hoogte;
    }

    public String getInhoud()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format((getDiameter() / 2) * (getDiameter() / 2) * Math.PI * getHoogte() / 2);
    }
}
