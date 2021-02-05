import java.util.Scanner;

public class test4 {
    public static void main(String args[]){
        Game gg = new Game();
        Scanner in = new Scanner(System.in);
        int x = 10;
        System.out.println("欢迎来到猜字游戏，请输入一个数字：");
        while(x != 0)
        {
            x = in.nextInt();
            if(gg.guess(x) == -1)
                System.out.println("猜的有点小，再试一下吧！");
            else if(gg.guess(x) == 1)
                System.out.println("猜大了噢，再试一下吧!");
            else
            {
                System.out.println("恭喜你，猜对了！");
                break;
            }

        }

    }
}
class Game{
    private int v = 100;
    public int guess(int x){
        if(x < v)
            return -1;
        else if(x > v)
            return 1;
        else
            return 0;
    }
}