import java.util.HashSet;
public class Hashset {
    public static void main(String[] args) {
        // Create a HashSet (no duplicates, no order)
        HashSet<String> set = new HashSet<>();
        
        // Add elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");  // Duplicate, will be ignored
        
        // Printing the set (the order may vary)
        System.out.println("Hash Set:"+set);    
}
}
