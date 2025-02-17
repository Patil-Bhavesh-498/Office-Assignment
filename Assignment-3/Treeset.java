import java.util.TreeSet;
public class Treeset {
    public static void main(String[] args) {
        // Create a TreeSet (no duplicates, elements are sorted by keys)
        TreeSet<String> set = new TreeSet<>();
        
        // Add elements to the set
        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        
        // Printing the set (elements are sorted)
        System.out.println("Tree Set:"+set);  
    }
}
