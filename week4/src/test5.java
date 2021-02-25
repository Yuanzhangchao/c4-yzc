import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入数组大小：");
        int len = in.nextInt();
        int[] array = new int[len];
        HashMap<Integer,Integer> ss = new HashMap<>();
        System.out.print("请输入数组元素：");
        for(int i = 0 ; i < len ; i++){
            int a = in.nextInt();
            if(ss.containsKey(a))
            {
                int value = ss.get(a);
                ss.put(a,++value);
            }
            else
            {
                ss.put(a,1);
            }
        }
        boolean temp = false;
        for(Map.Entry<Integer,Integer> entry : ss.entrySet()){
            if(entry.getValue() > (len/2)){
                System.out.println(entry.getKey());
                temp = true;
                break;
            }
        }
        if(!temp)
            System.out.println(-1);
    }
}
