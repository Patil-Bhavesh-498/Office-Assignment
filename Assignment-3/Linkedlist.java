import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        // Creating a List (LinkedList)
        LinkedList<String> list = new LinkedList<>();
        
        // Adding elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        //Printing using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        
        // Printing the list

        //System.out.println("Linked List :"+list);  
    }
}
}
