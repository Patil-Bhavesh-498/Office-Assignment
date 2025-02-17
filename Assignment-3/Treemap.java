import java.util.TreeMap;
public class Treemap {
    public static void main(String[] args) {
        //creating tree map (no duplicates, elements are sorted by keys)
        TreeMap<String,Integer> map = new TreeMap<>();

        //Adding elements to tree map
        map.put("Apple", 1);
        map.put("orange",2);
        map.put("banana",3);

        //printing tree map
        System.out.println("Tree map:"+map);
    }
}
