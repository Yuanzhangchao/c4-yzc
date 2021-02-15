import java.util.*;

public class test1 {
    public static void main(String args[]){
        List<List<Integer>> ss = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("请输入数组大小：");
        int size = in.nextInt();
        int[] nums = new int[size];
        System.out.print("请输入数组元素：");
        for(int i= 0 ; i < size; i++){
            Integer n = in.nextInt();
            nums[i] = n;
        }
        Arrays.sort(nums);
        System.out.print("请输入目标值：");
        Integer target = in.nextInt();
        for(int i = 0 ; i < size - 2 ; i++){
            for(int j = i+1 ; j <size -1 ; j++){
                for(int k = j+1 ; k < size ; k++){
                        if(nums[i] + nums[j] + nums[k] == target)
                        {
                            List<Integer> toS = new ArrayList<>();
                            toS.add(nums[i]);
                            toS.add(nums[j]);
                            toS.add(nums[k]);
                            if(!ss.contains(toS))
                                ss.add(toS);
                        }
                }
            }
        }
        System.out.println(ss);
    }
}
