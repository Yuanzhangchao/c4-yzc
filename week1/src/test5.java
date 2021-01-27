import java.text.NumberFormat;
import java.util.Scanner;

public class test5 {
    public static void main(String args[]){
        int r;
        System.out.print("输入半径：");
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        Circle circle = new Circle(r);
        System.out.println("The area is " + String.format("%.2f",circle.getArea()));
        System.out.println("The perimeter is " + String.format("%.2f",circle.getPerimeter()));
    }
}
class Circle{
    private int radius;
    public static double P = 3.14;
    public Circle (int radius)
    {
        this.radius = radius;
    }
    public double getArea(){
        return P * radius * radius;
    }
    public double getPerimeter(){
        return 2 * P * radius;
    }
}
