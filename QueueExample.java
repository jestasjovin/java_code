import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class QueueExample {
    public static void main(String[] args) {
        /* STARTING AND VIEW MY STUFFZ */

        Queue<String> fruitsQueue = new LinkedList<>();  // Creating a Queue
        fruitsQueue.add("Apple");
        fruitsQueue.add("Banana");
        fruitsQueue.add("Cherry");

        System.out.println("Fruits in the queue: just grabbing values");
        for (String fruit : fruitsQueue) {
            System.out.println(fruit);  // Iterating using for-each loop
        }


        /* OPERATIONS */

        // Accessing the front of the queue (peek)
        System.out.println("\nFirst fruit (peek): " + fruitsQueue.peek());
        // Checking if an item exists
        System.out.println("\nContains Banana: " + fruitsQueue.contains("Banana"));
        // Removing an item (poll removes and returns the front of the queue)
        fruitsQueue.poll();  // Removes "Apple"
        fruitsQueue.poll();  // Removes "Banana"


        /* DIFFERENT WAYS TO ITERATE */

        System.out.println("\nFruits after removal: for loop");
        Object[] queueArray = fruitsQueue.toArray();  // Converting Queue to Array for index access
        for (int i = 0; i < queueArray.length; i++) {
            System.out.println(queueArray[i]);  // Output remaining queue items
        }


        System.out.println("\nFruits after removal: while loop");
        int point = 0;
        while (point < fruitsQueue.size()) {
            System.out.println(queueArray[point]);  // Accessing the converted array
            point++;
        }

        System.out.println("\nFruits after removal: Iterator");
        Iterator<String> iterator = fruitsQueue.iterator();  
        while (iterator.hasNext()) {  
            String fruit = iterator.next();  
            System.out.println(fruit);  // Iterating through the Queue
        }

        
        /* CAN CLEAR IT */

        System.out.println("\nSize of queue: " + fruitsQueue.size());  // Checking size of the Queue
        fruitsQueue.clear();  // Clearing the Queue
        System.out.println("\nIs the queue empty? " + fruitsQueue.isEmpty());  // Checking if the Queue is empty
    }
}
