// Abstract class
abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main class
public class Abstraction_shpe {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Circle Perimeter: " + c.calculatePerimeter());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + r.calculateArea());
        System.out.println("Rectangle Perimeter: " + r.calculatePerimeter());
    }
}