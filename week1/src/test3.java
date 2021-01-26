import java.util.Scanner;

public class test3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("输入:");
        String s1 = in.nextLine();
        String s2;
        int i = s1.length();
        System.out.print("输出:");
        for(int j = i-1; j >= 0; j--)
        {
            System.out.print(s1.charAt(j));
        }
    }
}
