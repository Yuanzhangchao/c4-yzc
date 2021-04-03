import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        String[] words=
                new String[]{"cat","banana","dog","nana","walk","walker","dogwalker"};
        System.out.println(longestWord(words));
    }

    //解题思路：先把字符串数组排序，字符串长的在前面，相同长度的字典序小的在前面，排好序后加入到set里判断是否包含，从第一个字符串开始判断，看是否由其它字符串组成
    public static String longestWord(String[] words) {
        //按照规则排序
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length())
                    return o1.compareTo(o2);
                else{
                    return Integer.compare(o2.length(),o1.length());
                }
            }
        });

        Set<String> set = new HashSet<>(Arrays.asList(words));
        for(String word : words){
            set.remove(word);
            if(find(set,word))
                return word;
        }
        return "";
    }

    //从第一个字符串开始判断，看是否由其它字符串组成
    public static boolean find(Set<String> set, String word){
        if(word.length() == 0)
            return true;
        for(int i = 0; i < word.length(); i++){
            if(set.contains(word.substring(0,i+1)) && find(set,word.substring(i+1)))
                return true;
        }
        return false;
    }

}
