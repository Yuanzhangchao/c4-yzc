import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) {
        String ss = "0100110001010001";
        HashMap map = new HashMap();
        for(int i = 0 ; i < ss.length(); i++){
            for(int j = i+1; j<=ss.length();j++){
                String s = ss.substring(i,j);
                map.put(s,0);
            }
        }
        System.out.println(map.size());
    }
}
