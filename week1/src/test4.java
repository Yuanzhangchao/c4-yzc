import java.util.Scanner;

public class test4 {
    public static void main(String args[]){
        int a[] = new int[5];
        int b[] = new int[5];
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("输入:");
        for(int i = 0 ; i < 5 ; i++)
        {
            a[i] = in.nextInt();
        }
        int j = 0;
        for(int i = 0 ;i < 5; i++)
        {
            if(a[i] != 0)
            {
                b[j] = a[i];
                j++;
            }
        }
        for( ; j<5; j++)
        {
            b[j] = 0;
        }
        System.out.print("输出:");
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}
