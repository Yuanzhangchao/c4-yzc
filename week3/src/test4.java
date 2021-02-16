import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String string = in.next();
        HashMap<Character,Integer> count = new HashMap<Character,Integer>();
        char[] ss = string.toCharArray();
        for(int i = 0 ; i < ss.length ; i++){
            if(count.containsKey(ss[i])){
                int value = count.get(ss[i]);
                count.put(ss[i],++value);
            }
            else
                count.put(ss[i],1);
        }
        System.out.println(count);
        for(Map.Entry<Character,Integer> entry :count.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
