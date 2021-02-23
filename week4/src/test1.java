import java.util.Scanner;

public class test1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入原字符串：");
        String string = in.next();
        System.out.print("请输入字串:");
        String pattern = in.next();
        int l = string.length();
        int index = -1;
        boolean temp = false;
        int i;
        for( i = 0 ; i < l ;i++){
            if(string.startsWith(pattern,i)){ //从指定位置开始判断是否以这个字符串开头
                temp = true;
                break;
            }
        }
        if(temp)
            index = i;
        System.out.println(index);
    }
}
