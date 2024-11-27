package Car;

public class Car
{
    String model;
    int year;
    String brand;

    public Car()
    {

    }
    public Car(String model, int year)
    {
        this.model = model;
        this.year = year;
    }
    public Car(int year, String model, String brand)
    {
        this.year = year;
        this.model = model;
        this.brand = brand;
    }
    public void detail()
    {
        System.out.println(year+" " +model+" "+brand);
    }
}

