import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入小数：");
        double decimal = in.nextDouble();
        String string = String.valueOf(decimal);
        int len = string.length();
        int dian = string.indexOf(".");
        int weishu = len - dian - 1;
        int fenzi = (int)(decimal * Math.pow(10,weishu));
        int fenmu = (int)Math.pow(10,weishu);
        int gcd = getFactor(fenzi, fenmu);
        System.out.println((fenzi/gcd) + "/" + (fenmu/gcd));
    }
    public static int getFactor(int a, int b){
        int c = 1;
        while(c != 0){
            c = a % b;
            if(c == 0)
                break;
            a = b;
            b = c;
        }
        return b;
    }

}

