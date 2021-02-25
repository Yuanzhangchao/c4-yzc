import java.util.*;

public class test7 {
    public static void main(String[] args) {
        System.out.println("请输入字符串数组个数：");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        System.out.print("请输入字符串数组：");
        String[] strs = new String[len];
        for(int i = 0 ; i < len ;i++){
            strs[i] = in.next();
        }
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key,new ArrayList<String>());
            list.add(str);
            map.put(key,list);
        }
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
