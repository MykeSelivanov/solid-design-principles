package openclosedprinciple;

interface Shape {
    public double calculateArea();
}

class Rectangle implements Shape {
    public double length;
    public double width;

    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    public double radius;

    public double calculateArea() {
        return (22/7) * radius * radius;
    }
}

class AreaCalculator {
    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
}

public class OpenClosedExample {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Circle circle = new Circle();
        circle.radius = 10;

        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.length = 10;

        System.out.println(areaCalculator.calculateShapeArea(circle));
        System.out.println(areaCalculator.calculateShapeArea(rectangle));

    }
}
