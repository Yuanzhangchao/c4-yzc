
import java.util.ArrayList;
        import java.util.List;

//给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值
public class Test4 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,3,-1,-3,5,3,6,7};
        int k=3;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<=nums.length-k;i++){
            int max=nums[i];
            for(int j=1;j<k;j++){
                if(nums[i+j]>max){
                    max=nums[i+j];
                }
            }
            res.add(max);
        }

        System.out.println(res);
    }
}
