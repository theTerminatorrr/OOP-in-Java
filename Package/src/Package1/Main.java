package Package1;

public class Main
{
    public static void main(String[] args) {
        Package1.Package2.Class1 c1 = new Package1.Package2.Class1();
        Package1.Package3.Class1 c2 = new Package1.Package3.Class1();

        c1.display();
        System.out.println("--------");
        c2.display();

    }
}
