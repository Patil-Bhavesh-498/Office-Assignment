import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        // Create a HashMap (no duplicates, no order)
        HashMap<Integer, String> map = new HashMap<>();

        //Add elements to map
        map.put(1, null);
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(1, "Kiwi");// update Apple value 
        
        System.out.println("Hash Map:"+map);
        // Iterating through the Hashmap
       map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
