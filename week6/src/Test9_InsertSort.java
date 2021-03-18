/*插入排序*/
import java.util.Scanner;

public class Test9_InsertSort {
    public static void main(String[] args) {
        System.out.print("输入数组的个数：");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] data  = new int[len];
        System.out.print("输入元素：");
        for(int i = 0 ; i < len ;i++)
        {
            data[i] = in.nextInt();
        }
        //开始插入排序
        for(int i = 1 ; i < len ;i++){
            for(int  j = i-1 ; j >= 0 ; j--){
                if(data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        for(int tem : data){
            System.out.print(tem + " ");
        }
    }
}
