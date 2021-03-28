import java.util.HashMap;
import java.util.Stack;

public class Test1 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] finallNums = new int[nums1.length];
        int k = 0;
        Stack<Integer> stackNums2 = new Stack<Integer>();
        for(int i = nums2.length-1;i>=0; i--){
            stackNums2.push(nums2[i]);
        }
        for(int num : nums1){
            boolean temp = false;
            while(!stackNums2.isEmpty()){
                if(num == stackNums2.peek()){
                    stackNums2.pop();
                    if(!stackNums2.isEmpty()){
                        int x = stackNums2.peek();
                        if(num < x){
                            finallNums[k] = x;
                            k++;
                            temp = true;
                            break;
                        }
                    }


                }
                if(!stackNums2.isEmpty()){
                    stackNums2.pop();
                }
            }
            if(!temp){
                finallNums[k] = -1;
                k++;
            }
            stackNums2.clear();
            for(int i = nums2.length-1;i>=0; i--){
                stackNums2.push(nums2[i]);
            }
        }
            for(int x : finallNums){
                System.out.println(x);
            }
    }
}
