package StudentCGPA;

public class ShowOutput
{
    public static void main(String[] args)
    {
        Student [] students = new Student[3];
        students[0] = new Student ("Jony", "0112330060", 3.2, 25);
        students[1] = new Student ("Nazmul", "0112330070", 3.32, 29);
        students[2] = new Student ("Badhan", "0112330075", 3.12, 27);

        double maximumCGPA = students[0].CGPA;
        int index = 0;
        for(int i = 0; i < students.length; i++ )
        {
            if( students[i].CGPA > maximumCGPA)
            {
                maximumCGPA = students[i].CGPA;
                index = i;
            }
        }
        System.out.println("The Mximum CGPA holder is : " +students[index].name);
    }
}
