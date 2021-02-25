import java.util.Arrays;
import java.util.Scanner;

public class test4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入数组大小：");
        int len = in.nextInt();
        System.out.print("请输入数组元素:");
        int[] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        System.out.print("要查找得是第几小得数：");
        int target = in.nextInt();
        System.out.println(array[target-1]);
    }
}
