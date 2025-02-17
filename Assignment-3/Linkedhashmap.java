import java.util.LinkedHashMap;
public class Linkedhashmap {
    public static void main (String [] args){
        //Create a Linked hash map (no duplicates, maintains insertion order)
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        
        //Adding elements to linked hash map
        map.put("Apple",1);
        map.put("Banana",2);
        map.put("Orange",3);

        //printing linked hash map
        System.out.println("Linked Hash Map:"+map);

    }
    
}
