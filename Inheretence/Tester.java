package Inheretence;

public class Tester
{
    public static void main(String[] args)
    {
        CSEStudent s1 = new CSEStudent("Johnny", 60);
        CSEStudent s2 = new CSEStudent("Ive", 50);

        s1.showDetail();
        s1.doClass();
        s2.doLabClass();
    }
}
