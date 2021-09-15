package openclosedprinciple;

class Rectangle {
    public double length;
    public double width;
}

class AreaCalculator {
    public double calculateRectangleArea(Rectangle rectangle){
        return rectangle.length * rectangle.width;
    }

    public double calculateCirleArea(Circle circle) {
        return (22/7) * circle.radius * circle.radius;
    }
}

class Circle {
    public double radius;
}

public class OpenClosedExample {
    public static void main(String[] args) {

    }
}
