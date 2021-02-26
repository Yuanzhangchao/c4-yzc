
import java.util.Scanner;

public class test2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入字符串:");
        String string = in.next();
        char[] ss = string.toCharArray();
        int len = string.length();
        int index = -1;
        for(int i = 0 ; i < len ; i++){
            int sub = 0;
            for(int j = 0; j <len ;j++){
                if(ss[i] == ss[j] && i != j){
                    sub++;
                    break;
                }
            }
            if(sub == 0){
                index =i;
                break;
            }
        }
        System.out.print(index);

    }

}
