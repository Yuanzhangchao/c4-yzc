import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int[] nums1 = new int[n];
        for(int i = 0; i < n ; i++){
            nums[i] = in.nextInt();
            nums1[i] = nextMin(nums[i]);
        }
        Arrays.sort(nums1);
        int s;
        if(n %2 != 0){
            s = n/2 +1;
        }
        else
            s =n/2;
        int sum = 0;
        for(int i = 0 ; i < s; i++){
            sum += nums1[i];
        }
        System.out.println(sum);

    }
    public static int nextMin(int x){
        int min = 100;
        int i = 0;
        for( ; i*i < x ; i++){
            min = Math.min(min,Math.abs(i*i-x));
        }
        min = Math.min(min,Math.abs(i*i-x));
        return min;
    }
}
