
abstract class Shape {
    abstract double area(); // Abstract method to calculate area

    // Method to display shape's area
    void displayArea() {
        System.out.println("Area: " + area());
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override area method to calculate area of triangle
    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override area method to calculate area of rectangle
    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override area method to calculate area of circle
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class shape {
    public static void main(String[] args) {
        // Create instances of each shape
        Triangle triangle = new Triangle(5, 8);
        Rectangle rectangle = new Rectangle(6, 9);
        Circle circle = new Circle(4);

        // Display area of each shape
        System.out.println("Area of Triangle:");
        triangle.displayArea();

        System.out.println("Area of Rectangle:");
        rectangle.displayArea();

        System.out.println("Area of Circle:");
        circle.displayArea();
    }
}
