package LMS_Application;

public class StudentGrades
{
    private double[] grades;

    public StudentGrades(double[] grades)
    {
        this.grades = grades;
    }

    public double[] getGrades()
    {
        return grades;
    }

    public void setGrades(double[] grades)
    {
        this.grades = grades;
    }

    public double averageGrade()
    {
        double sum = 0;
        for (double grade : grades)
        {
            sum += grade;
        }
        return sum / grades.length;
    }

    public double maxGrade()
    {
        double max = grades[0];
        for (double grade : grades)
        {
            if (grade > max)
            {
                max = grade;
            }
        }
        return max;
    }

    public double minGrade()
    {
        double min = grades[0];
        for (double grade : grades)
        {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    public void fixGrades()
    {
        for (int i = 0; i < grades.length; i++)
        {
            if (grades[i] < 0)
            {
                grades[i] = 0;
            }
        }
    }

    public void displayGrades()
    {
        for (double grade : grades)
        {
            if (grade >= 90)
            {
                System.out.print("A ");
            }
            else if (grade >= 80)
            {
                System.out.print("B ");
            }
            else if (grade >= 70)
            {
                System.out.print("C ");
            }
            else if (grade >= 60)
            {
                System.out.print("D ");
            }
            else
            {
                System.out.print("F ");
            }
        }
        System.out.println();
    }
}