package homework;

public class Circle extends GeometricFigure {

    public double radius;

    public Circle(double radius) {

        this.radius = radius;

    }

    public double calculateArea() {
        System.out.println("Circle has are of");
        return Math.PI * radius + radius;

    }

    public String getName() {
        return "Circle";
    }

}






