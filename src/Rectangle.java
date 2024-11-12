import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void rectangleOrNot(){
        if (width == height){
            System.out.println("Это не прямоугольник");
        } else {
            System.out.println("Это прямоугольник");
        }
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2 *(width*height);
    }

    public void resize(double scale){
        System.out.println("Введите во сколько раз хотите увеличить прямоугольник: ");
        scale = new Scanner(System.in).nextDouble();

        width *= scale;
        height *= scale;
    }
}
