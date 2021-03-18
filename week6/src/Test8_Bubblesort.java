//冒泡排序
import java.util.Scanner;
public class Test8_Bubblesort {
    public static void main(String args[]){
        System.out.print("输入数字个数：");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] data = new int[len];
        for(int i = 0 ; i < len ; i++){
            data[i] = in.nextInt();
        }
        //开始冒泡排序
        int tem;
        for(int i = 0 ; i < len -1 ;i++){
            for(int j = 0 ; j < len-1-i;j++){
                if(data[j] > data[j+1]){
                    tem = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tem;
                }
            }
        }
        for(int k :data){
            System.out.print(k + " ");
        }

    }
}
