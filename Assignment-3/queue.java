import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        // Creating a Queue (LinkedList)
        Queue<String> queue = new LinkedList<>();
        
        //Adding elements to the Queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
         
        System.out.println("Queue :");
        while (!queue.isEmpty()) { //checking that queue is Empty
             System.out.println(queue.poll());  //Retrieve and remove from head
            
        }  
        
    }
}