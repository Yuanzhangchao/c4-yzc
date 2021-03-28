import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        int[] nums  = {1,2,3,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else
                map.put(num,map.get(num)+1);
        }
        int sum = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() ==1){
                sum+=entry.getKey();
            }
        }
        System.out.println(sum);

    }
}
