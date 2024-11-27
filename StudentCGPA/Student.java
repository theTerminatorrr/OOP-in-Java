package StudentCGPA;

public class Student
{
    String name;
    String id;
    double CGPA;
    int creditCompleted;

    public Student(String name, String id, double CGPA, int creditCompleted)
    {
        this.name = name;
        this.id = id;
        this.CGPA = CGPA;
        this.creditCompleted = creditCompleted;
    }
}
