import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //Adding an items to stack
        stack.push(30);
        stack.push(10);
        stack.push(20);
        
        System.out.println("Stack :");
        while (!stack.isEmpty()) { //checking that queue is Empty
            System.out.println(stack.pop());  //Retrieve and remove from head
        }
    }
}