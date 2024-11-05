public abstract class Cars
{
    private String model;
    private String color;
    private int topSpeed;

    public Cars(String model, String color, int topSpeed)
    {
        this.model = model;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public String getModel()
    {
        return model;
    }

    public String getColor()
    {
        return color;
    }

    public int getTopSpeed()
    {
        return topSpeed;
    }


}

