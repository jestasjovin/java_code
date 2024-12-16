import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        /* STARTING  AND VIEW MY STUFFZ */

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits in the list: just grabing values");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        /* OPERATIONS */

        // Accessing an item by index
        System.out.println("\nFirst fruit: " + fruits.get(0));  
        // Checking if an item exists
        System.out.println("\nContains Banana: " + fruits.contains("Banana"));
        // Removing an item by value
        fruits.remove("Banana");
        // Removing an item by index
        fruits.remove(1); 


        /* DIFFERENT WAYS TO ITERATE */

        System.out.println("\nFruits after removal:for loop");
        for (int i =0; i< fruits.size(); i ++) {
            System.out.println(fruits.get(i));  // Output: "Apple"
        }


        System.out.println("\nFruits after removal: while loop");
        int point = 0;
        while(point < fruits.size()){
            System.out.println(fruits.get(point));
            point++;
        }


        System.out.println("\nFruits after removal: Iterator");
        Iterator<String> iterator = fruits.iterator();  
        while (iterator.hasNext()) {  
            String fruit = iterator.next();  
            System.out.println(fruit);  
        }

        
        /* CAN CLEAR IT */

        System.out.println("\nSize of list: " + fruits.size()); 
        fruits.clear();
        System.out.println("\nIs the list empty? " + fruits.isEmpty());  
    }
}
