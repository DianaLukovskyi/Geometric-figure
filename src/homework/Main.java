package homework;

public class Main {
    public static void main(String[] args) {
        /*
       Геометрические фигуры
    Используя свойства наследования написать программу для подсчета площади трех видов фигур -
    круга, прямоугольника и квадрата.

    Создать классы Circle, Rectangle, Square , содержащие соответствующие методы.
    Затем в методе main создать маcсив из нескольких фигур и вывести на печать площади каждой фигуры и название ее
    примерно в таком виде :
    Circle has area of 100.0
    Rectangle has area of 400.0
    Square has area of 340.0

         */
        GeometricFigure[] geometricFigure = new GeometricFigure[3];
        geometricFigure[0] = new Circle(10.0);
        geometricFigure[1] = new Rectangle(20.0, 10.0);
        geometricFigure[2] = new Square(18.0);

        for(GeometricFigure geometricFigure1 : geometricFigure){

            System.out.println("Has area of" + geometricFigure1.getName() + geometricFigure1.calculateArea());

        }


    }




    }
















