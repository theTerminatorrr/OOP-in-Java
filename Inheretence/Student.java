package Inheretence;

// this is the Parent class which will be inherited by Child class ;

public class Student
{
    public String name;
    public int id;

    public void showDetail()
    {
        System.out.println("Name: " +name);
        System.out.println("ID: " +id);
    }

    public void doClass()
    {
        System.out.println(name +" is doing class.");
    }

    public void doLabClass()
    {
        System.out.println(name + " " + id +" is doing lab class.");
    }
}

