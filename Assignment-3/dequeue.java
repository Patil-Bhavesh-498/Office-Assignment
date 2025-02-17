import java.util.*;
public class dequeue {

    public static void main(String[] args) {
        // Create a Deque using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to the Deque
        deque.add("A");  // Adds to the queue
        deque.addLast("B");   // Adds to the end
        deque.addFirst("C");  // Adds to the front

        

        // Display remaining elements
        System.out.println("Remaining Deque: " + deque);
    }


}
