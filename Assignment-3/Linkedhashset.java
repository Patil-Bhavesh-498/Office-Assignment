import java.util.LinkedHashSet;

public class Linkedhashset {
    public static void main(String[] args) {
        // Create a LinkedHashSet (no duplicates, maintains insertion order)
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        // Add elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        
        // Printing the set (insertion order is maintained)
        System.out.println("Linked hash set:"+set);  
    }
}
