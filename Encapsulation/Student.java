package Encapsulation;

public class Student
{
    private String name;
    private int id;
    public Student (String nm, int i)
    {
        name = nm;
        id = i;
    }

    public void setID (int i)
    {
        if (i>0)
        {
            id = i;
        }
        else
        {
            System.out.println("Invalid Id given");
        }
    }

    public int getID ()
    {
        return id;
    }

    public void setName (String nm)
    {
        name = nm;
    }

    public String getName()
    {
        return name;
    }

    public void showDetail()
    {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}

