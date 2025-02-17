import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // Creating a List (ArrayList)
        ArrayList<String> list = new ArrayList<>();
        
        // Adding elements to the list
        list.add("Apple");
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        //Printing using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        // Printing the list
        //System.out.println("ArrayList :" +list);  
    }
    
}
}
