class A{
    void display(){
        System.out.println("This is display of A method");
    }
    void methodA(){
        System.out.println("This is A method");
    }
}
class B extends A {
    @Override
     void display(){
        System.out.println("This is display of B method");
    }
    void methodB(){
        System.out.println("This is B method");
    }
}
public class Xyz {
    public static void main(String[] args) {
        A a = new B();
    a.methodA();
    //a.methodB();
    a.display();
    }  
}
