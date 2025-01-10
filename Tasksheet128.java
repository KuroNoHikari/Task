import java.math.*;

interface Shape{
    double calculateArea();
    double calculatePerimeter();
}

abstract class AbstractShape implements Shape{
    String color;
    double length;
    double width;
    AbstractShape (String color, double length, double width){
    this.color = color;
    this.length = length;
    this.width = width;
    }
    public static class Circle extends AbstractShape {
        double radius;

        public Circle(String color, double radius) {
            super(color, 0, 0);
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }
    public static class Rectangle extends AbstractShape {
        public Rectangle(String color, double length, double width) {
            super(color, length, width);
        }

        @Override
        public double calculateArea() {
            return length * width;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * (length + width);
        }
    }
}


public class Tasksheet128{
    public static void main(String[] args) {
    AbstractShape.Circle circle = new AbstractShape.Circle("Blue", 5.0);
    AbstractShape.Rectangle rectangle = new AbstractShape.Rectangle("Purple", 10, 5);
        //Circle
        System.out.println("Circle Details");
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter:" + circle.calculatePerimeter());

        System.out.println();

        //Rectangle
        System.out.println("Rectangle Details:");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
