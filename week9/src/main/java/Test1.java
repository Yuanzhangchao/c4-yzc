
import java.util.*;

public class Test1 {
    private static class ValueComparator implements Comparator<Map.Entry<Integer,Integer>>{

        @Override
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
            return o2.getValue()-o1.getValue();
        }
    }
    public static void main(String[] args) {
        Map<Integer,Integer> map  = new HashMap<Integer, Integer>();
        for(int i = 0 ; i  < 1000 ; i ++){
            int x = (int)(Math.random()*100);
            if(!map.containsKey(x)){
                map.put(x,1);
            }
            else
            {
                int value = map.get(x);
                map.put(x,value+1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>();
        list.addAll(map.entrySet());
        Test1.ValueComparator vc = new ValueComparator();
        Collections.sort(list,vc);
        int i = 0;
        for(Iterator<Map.Entry<Integer,Integer>> it = list.iterator();it.hasNext()&&i <= 10;i++){
            System.out.println(it.next());
        }

    }
}
