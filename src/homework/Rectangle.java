package homework;

public class Rectangle extends GeometricFigure {


    public double length;
    public double width;

    public Rectangle(double length, double width) {

        this.length = length;
        this.width = width;

    }

    public double calculateArea() {
        System.out.println("Rectangle has area of");
        return length * width;

    }

    public String getName() {
        return "Rectangle";
    }


}






