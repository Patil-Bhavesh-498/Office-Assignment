import java.util.*;
public class Priorityqueue {
    public static void main(String[] args) {
        // Example with integers (natural ordering, smallest number has highest priority)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> q = new LinkedList<>();
        // Adding value to the queue
        q.add(5);
        q.add(2);
        pq.add(9);
        q.add(1);

        System.out.println("Priority Queue (min-heap):");
        while (!pq.isEmpty()) { //checking that queue is Empty
            System.out.println(pq.poll());  //Retrieve and remove from head
        }
        while (!q.isEmpty()) { //checking that queue is Empty
            System.out.println(q.poll());  //Retrieve and remove from head
        }
        
    }
}



