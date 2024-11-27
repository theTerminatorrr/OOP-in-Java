package ConstructorOverLoading;

public class Tester
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Bob", 11);
        Student s2 = new Student("Carol", 33);
        Student s3 = new Student();
        Student s4 = new Student("David", 55, 4.0);

        s1.showDetail();
        s2.showDetail();
        s3.showDetail();
        s4.showDetail();
    }
}

