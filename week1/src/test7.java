import java.util.Scanner;

public class test7 {
    public static void main(String args[]){
        int real1,empty1,real2,empty2;
        Scanner in  = new Scanner(System.in);
        System.out.print("输入：");
        real1 = in.nextInt();
        empty1 = in.nextInt();
        real2 = in.nextInt();
        empty2 = in.nextInt();
        Complex x1 = new Complex(real1,empty1);
        Complex x2 = new Complex(real2,empty2);
        System.out.println("两复数相加的结果为：" + x1.add(x2).output());
        System.out.println("两复数相减的结果为：" + x1.reduce(x2).output());
        System.out.println("两复数相乘的结果为：" + x1.multiply(x2).output());
    }

}
class Complex{
    private int real;
    private int empty;
    public Complex(int real, int empty){
        this.real = real;
        this.empty = empty;
    }
    public Complex add(Complex a){
        int real2 = a.real + this.real;
        int empty2 = a.empty + this.empty;
        return new Complex(real2,empty2);
    }
    public Complex reduce(Complex a){
        int real2 = this.real - a.real;
        int empty2 = this.empty - a.empty;
        return new Complex(real2,empty2);
    }
    public Complex multiply(Complex a){
        int real2 = this.real * a.real - this.empty * a.empty;
        int empty2 = this.empty * a.real + this.real * a.empty;
        return new Complex(real2,empty2);
    }
    public String output(){
        if(empty != 0 && real != 0)
            return real + "+" + empty + "i";
        else if(empty ==0 && real != 0)
            return real +"";
        else if(empty != 0 && real ==0)
            return empty + "i";
        else
            return real + "";
    }
}