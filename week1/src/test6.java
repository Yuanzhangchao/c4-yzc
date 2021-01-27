import java.util.Scanner;

public class test6 {
    public static void main(String args[]){
        String name;
        int count;
        System.out.print("请输入用户名及账户余额：");
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        count = in.nextInt();
        Bank s1 = new Bank(name,count);
        System.out.print("余额查询结果为：" + s1.FindCount());

    }
}
class Bank{
    private String name;
    private int count;
    public Bank(String name, int count){
        this.name = name;
        this.count = count;
    }
    public int FindCount(){
        return count;
    }
}
