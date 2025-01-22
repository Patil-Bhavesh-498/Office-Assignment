class test {
    int a;
    int b;
    public test(int a , int b){// Constructor
        this.a = a;
        this.b = b;
    }
    public void sum(){ //public method
        int sum = a + b ;
        System.out.println("Total Sum of "+a+" and "+b+" is : "+sum);
    }
 /* 
    static void sum(int a, int b){ //static method
        int sum = a + b ;
        System.out.println("This is static method");
        System.out.println("Total Sum of "+a+" and "+b+" is : "+sum);
}
 */
{
    System.out.println("This is a block"); //block
}
static{
    System.out.println("This is a Static block");// static block
}

    public static void main(String[] args) {
        test t = new test(5, 5) ;
        t.sum();
    }
}