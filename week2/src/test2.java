import java.util.Scanner;
import java.util.*;
public class test2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n ;
        System.out.print("请输出字符串数组的长度:");
        n = in.nextInt();
        String[] tt = new String[n];
        int min = 1000;
        for (int i = 0 ; i < n ; i++){
            tt[i] = in.next();
            min = Math.min(min,tt[i].length());
        }
        String ss = "";
        boolean aa = true;
        for(int i = 0; i < min ; i++){
            String part = tt[0].substring(0,i+1);
            for(int j = 0 ; j < n ;j++){
                if(!tt[j].startsWith(part)){
                    aa = false;
                    break;
                  }
            }
            if(aa)
            {
                ss = part;
            }
            else
                break;
        }
        System.out.println(ss);
    }
}
