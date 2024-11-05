public class Car1 extends Cars
{
    private String name;
    
    public Car1(String name, String model, String color, int topSpeed)
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
        return "Congratulations, your description of Lightning McQueen was spot on!";
    }
}