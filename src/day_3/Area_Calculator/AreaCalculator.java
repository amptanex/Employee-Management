package day_3.Area_Calculator;

public class AreaCalculator {

    public static void main(String[] args) {
        Square square = new Square(8);
        System.out.println("Area of Square: " + square.area());

        Shape rectangle = new Rectangle(8, 9);
        System.out.println("Area of Rectangle: " + rectangle.area());

        Shape circle = new Circle(4);
        System.out.println("Area of Circle: " + circle.area());

        Triangle triangle = new Triangle(4, 3);
        System.out.println("Area of triangle: " + triangle.area());

    }


}
