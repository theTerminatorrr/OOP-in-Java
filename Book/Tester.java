package Book;

public class Tester
{
    public static void main(String[] args)
    {
        Book b1 = new Book();
        b1.title = "Jibon Jekhane Jemon.";
        b1.author = "Arif Azad";
        Book b2 = new Book();
        b2.title = "A Brief History of Time.";
        b2.author = "Stephen Hawking.";
        b1.show();
        b2.show();
    }
}
