import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        List<List<Integer>> nums = new ArrayList<>();
        System.out.print("输入数组个数：");
        int len = in.nextInt();
        int[] arr = new int[len];
        for(int i = 0 ; i < len ;i++){
            arr[i] = in.nextInt();
        }
        nums = subsets(arr);
        System.out.println(nums);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int l = nums.length;
        int m = (int)Math.pow(2, l);
        for (int i = 0; i < m; i++){
            String b = Integer.toBinaryString(i);
            int re = nums.length - b.length();
            List<Integer> list = new ArrayList<>();
            for (int j = b.length() - 1; j >= 0; j--){
                if (b.charAt(j) == '1'){
                    list.add(nums[j + re]); // 索引回去
                }
            }
            result.add(list);
        }
        return result;
    }
}
