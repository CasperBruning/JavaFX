public class Auto
{
    private String autosoort;
    private String merk;
    private String model;
    private int vermogen;
    private String brandstof;

    public Auto(String autosoort, String merk, String model, int vermogen, String brandstof){
        this.autosoort = autosoort;
        this.merk = merk;
        this.model = model;
        this.vermogen = vermogen;
        this.brandstof = brandstof;
    }

    public String getAutosoort()
    {
        return autosoort;
    }

    public void setAutosoort(String autosoort)
    {
        this.autosoort = autosoort;
    }

    public String getMerk()
    {
        return merk;
    }

    public void setMerk(String merk)
    {
        this.merk = merk;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getVermogen()
    {
        return vermogen;
    }

    public void setVermogen(int vermogen)
    {
        this.vermogen = vermogen;
    }

    public String getBrandstof()
    {
        return brandstof;
    }

    public void setBrandstof(String brandstof)
    {
        this.brandstof = brandstof;
    }

    @Override
    public String toString()
    {
        return merk + " " + model;
    }
}
