import java.util.ArrayList;

public class Arrayist
{
        public static void main(String[] args)
        {
            // 1. Create a new ArrayList of Strings
            ArrayList<String> fruits = new ArrayList<>();

            // 2. Add elements
            fruits.add("Apple");
            fruits.add("Mango");
            fruits.add("Banana");
            fruits.add("Cherry");
            System.out.println("Original list: " + fruits);

            // 3. Access an element by index
            String firstFruit = fruits.get(0);
            System.out.println("First fruit: " + firstFruit);

            // 4. Get the size of the list
            System.out.println("List size: " + fruits.size());

            // 5. Remove an element
            fruits.remove("Banana");
            System.out.println("After removing Banana: " + fruits);

            // 6. Iterate through the list
            System.out.print("Iterating: ");
            for (String fruit : fruits) {
                System.out.print(fruit + " ");
            }
            System.out.println();

            // 7. Check if list contains an element
            if (fruits.contains("Apple")) {
                System.out.println("List contains Apple!");
            }

            // 8. Clear the list
            fruits.clear();
            System.out.println("List after clear(): " + fruits);
        }
}