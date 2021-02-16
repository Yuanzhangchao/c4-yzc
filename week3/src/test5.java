import java.util.Scanner;

public class test5 {
    static String[] usernames = {"张三","李四","王五"};
    public static void main(String[] args) throws RegisterException {
        System.out.println("请输入要注册的用户名:");
        Scanner  in = new Scanner(System.in);
        String username= in.next();
        checkUsername(username);
    }
    public static void checkUsername(String username) throws RegisterException {
        for(String name : usernames){
            if(name.equals(username)){
                try{
                    throw new RegisterException("该用户已经被注册");
                }catch (RegisterException e){
                    e.printStackTrace();
                    return;}
            }
        }
    }
}
class RegisterException extends Exception{
    public RegisterException(){
        super();
    }
    public RegisterException(String message){
        super(message);
    }
}
