package Car;

public class Tester
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        Car c2 = new Car("BMW X7", 2023);
        Car c3 = new Car(2024, "GLS 580", "Mercedes" );

        c1.detail();
        c2.detail();
        c3.detail();
    }
}

