class A {
    void display(String s) {
        System.out.println(s);
    }

    /*void display(int i) {
        System.out.println("This is A method with int parameter");
    }*/
}

class B extends A {
    
    String display() {  
        String r = "this is string";
        System.out.println(r);
        return r;
    }
}

public class Overriding_1 {
    public static void main(String[] args) {
        B b = new B();
        b.display();
        
        
    }
}
