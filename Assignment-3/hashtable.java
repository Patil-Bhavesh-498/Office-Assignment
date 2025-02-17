import java.util.Hashtable;
public class hashtable {
    public static void main(String[] args) {
        // Creating a Hashtable (we can't used key as null and same as value)
        Hashtable<Integer, String> table = new Hashtable<>();
        
        // Adding elements
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Orange");
        //table.put(1, "Kiwi");// update Apple value
        System.out.println("Hashtable :");
          
        // Iterating through the Hashtable
        table.forEach((key, value) -> System.out.println(key + ": " + value));
        
    }
}


