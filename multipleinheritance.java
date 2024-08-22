// Interface for Shape
interface Shape {
    void draw();
}

// Interface for Circle Area calculation
interface CircleArea {
    double calculateCircleArea();
}

// Interface for Square Area calculation
interface SquareArea {
    double calculateSquareArea();
}

// Class implementing all interfaces
class AreaCalculator implements Shape, CircleArea, SquareArea {
    private double radius;
    private double side;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing shapes...");
    }

    @Override
    public double calculateCircleArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculateSquareArea() {
        return side * side;
    }
}

// Main class to test the implementation
public class multipleinheritance {
    public static void main(String[] args) {
        // Create an object of AreaCalculator
        AreaCalculator ac = new AreaCalculator();
        
        // Set values for radius and side
        ac.setRadius(3.5);
        ac.setSide(4);

        // Drawing shapes
        ac.draw();

        // Calculate and print area of Circle
        double circleArea = ac.calculateCircleArea();
        System.out.println("Area of Circle with radius " + ac.getRadius() + ": " + circleArea);

        // Calculate and print area of Square
        double squareArea = ac.calculateSquareArea();
        System.out.println("Area of Square with side " + ac.getSide() + ": " + squareArea);
    }
}
