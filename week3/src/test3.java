import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class test3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String ss = in.next();
        char[] bb = ss.toCharArray();
        HashSet<Character> toS = new HashSet<Character>();
        for(int i = 0 ;i < bb.length; i++){
            toS.add(bb[i]);
        }
        String string1 = "";
        Iterator it = toS.iterator();
        while(it.hasNext()){
            string1 += it.next();
        }
        System.out.println(string1);
    }
}
