abstract class Shape {
    // Abstract method to calculate area
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementing abstract method
    @Override
    double area() {
        return width * height;
    }
}

public class abstract_1 {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        
        System.out.println("Circle:");
        System.out.println("Area of Circle:" + c.area());
        
        System.out.println("\nRectangle:");
        System.out.println("Area of Rectangle: " + r.area());
    }
}
