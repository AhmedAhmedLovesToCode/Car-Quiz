public class Car2 extends Cars
{
    private String name;

    public Car2(String name, String model, String color, int topSpeed)
    {
        super(model, color, topSpeed);
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return "Congratulations, your description of Sally was on point!";
    }
}