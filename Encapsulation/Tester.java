package Encapsulation;

public class Tester
{
    public static void main(String[] args)
    {
        Student s1 = new Student ("Bob", 11);
        Student s2 = new Student("Carol", 33);

        s1.setID (55);
        System.out.println(s1.getID());
        s1.showDetail();
    }
}
