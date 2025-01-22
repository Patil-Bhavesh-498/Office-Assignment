interface Shape {
    // Abstract method to calculate the area of the shape
    double Area();
}

// Implement the Shape interface in the Circle class
class Circle implements Shape {
    private double radius;

    // Constructor 
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius; 
    }
}

// Implement the Shape interface in the Rectangle class
class Rectangle implements Shape {
    private double width;
    private double height;

    // Constructor 
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double Area() {
        return width * height; 
    }


}

public class Main {
    public static void main(String[] args) {
        
        Shape circle = new Circle(5); 
        Shape rectangle = new Rectangle(4, 6); 

        System.out.println("Circle:");
        System.out.println("Area: " + circle.Area());
        
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.Area());
        
    }
}
