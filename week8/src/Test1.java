import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x= in.nextDouble();
        StringBuilder ss = new StringBuilder();
        ss.append("0");
        ss.append(".");
        boolean temp = true;
        while(x > 0){
            if(ss.length() >= 32){
                temp = false;
                break;
            }
            double num =2*x;
            if(num >= 1){
                ss.append("1");
                x= num-1;
            }
            else{
                ss.append("0");
                x= num;
            }
        }
        if(temp){
            System.out.println(ss);
        }
        else
            System.out.println("ERROR");
    }
}
