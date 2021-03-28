import java.util.ArrayList;
import java.util.Collections;

//给定一个二进制数组，计算其中最大连续 1 的个数。
public class Test5 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,1,0,1,1,1,0,1,1,1,1,1,0,0,1};

        //维护一个滑动窗口用于存储连续的1，如果发现有更长的滑动窗口，则把之前的替换掉
        ArrayList<Integer> list=new ArrayList<>();
        int maxLen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                maxLen++;
            } else {
                list.add(maxLen);
                maxLen=0;
            }
        }
        list.add(maxLen); //将循环结束后最后统计的一次加入

        Collections.sort(list);//排序，然后取出最大的滑动窗口的长度
        System.out.println(list.get(list.size()-1));
    }
}
