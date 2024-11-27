package ConstructorOverLoading;

 public class Student
{
    public String name; //instance variable
    public int id; //instance variable
    public double cgpa;//instance variable

    public Student ()
    {
        System.out.println("no parameter I was called");
    }

    public Student (String name, int id)
    {
        System.out.println("2 parameter I was called");
        this.name = name;
        this.id = id;
    }
    public Student (String name, int id, double cgpa)
    {
        System.out.println("3 parameter I was called");
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public void standUp ()
    {
        System.out.println(name+" is now standing");
    }

    public void showDetail()
    {
        System.out.println(name+" "+id+" "+cgpa);
    }
}
