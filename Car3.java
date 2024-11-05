public class Car3 extends Cars
{
    private String name;

    public Car3(String name, String model, String color, int topSpeed)
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
        return "Congratulations, your description on Tow Mater was on point!";
    }
}