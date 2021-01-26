import javax.swing.plaf.basic.BasicMenuUI;
import java.util.Scanner;

public class test1 {
        public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            System.out.print("输入体总（kg）：");
            int weight = in.nextInt();
            System.out.print("输入身高（m）：");
            double height = in.nextDouble();
            double BMI = weight/(height * height);
            if(BMI < 18.5)
                    System.out.print("过轻");
            else if(BMI <= 25)
                    System.out.print("正常");
            else if(BMI <= 28)
                    System.out.print("过重");
            else if(BMI <= 32)
                    System.out.print("肥胖");
            else
                    System.out.print("非常肥胖");
        }
}
