import java.util.Scanner;
import java.util.Stack;

public class test6 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        System.out.println("请输入字符串：");
        Scanner in = new Scanner(System.in);
        String string = in.next();
        boolean temp = true;
        for(char c : string.toCharArray()){
            if(c == '('){
                stack.push(')');
            }
            else if(c == '{'){
                stack.push('}');
            }
            else if(c == '['){
                stack.push(']');
            }
            else if(stack.empty() || c != stack.pop()){
                temp = false;
            }
        }
        System.out.println(temp);

    }
}
