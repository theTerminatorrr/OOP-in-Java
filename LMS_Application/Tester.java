package LMS_Application;

public class Tester
{
        public static void main(String[] args)
        {
            double[] grades = {95, 82, 77, 68, 53, 42, -10};
            StudentGrades studentGrades = new StudentGrades(grades);

            System.out.println("Average Grade: " + studentGrades.averageGrade());
            System.out.println("Max Grade: " + studentGrades.maxGrade());
            System.out.println("Min Grade: " + studentGrades.minGrade());

            studentGrades.fixGrades();
            System.out.println("Grades after fixing: ");
            studentGrades.displayGrades();
        }
}

