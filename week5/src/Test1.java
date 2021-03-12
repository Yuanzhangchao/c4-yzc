import java.util.Scanner;

public class Test1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        long  number = in.nextInt();
        long number1 = 0;
        while(number != 0)
        {
            number1 = number1*10 +number%10;
            number/=10;
        }
        if(number1 > Integer.MAX_VALUE || number1 < Integer.MIN_VALUE)
            System.out.println(0);
        else
            System.out.println(number1);
    }
}
