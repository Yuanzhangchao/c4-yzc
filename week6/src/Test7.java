import com.sun.javaws.IconUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入矩阵的行数和列数：");
        int line = in.nextInt(); //读入行数
        int row = in.nextInt();  //读入列数
        System.out.println("请输入矩阵的各个元素：");
        int[][] data  = new int[line][row];
        for(int i = 0 ;i < line; i++){
            for(int j = 0; j < row ; j++){
                data[i][j] = in.nextInt();
            }
        }
        //开始遍历输出
        int i = 0 ,j = 0; // i表示行,j表示列
        List<Integer> list = new ArrayList<>();
        int total = 0;
        while(total < (line * row)){
            while(j < row && data[i][j] != 0 &&total < (line * row)){
                list.add(data[i][j]);
                data[i][j++] = 0;
                total++;
            }
            i++;j--;
            while(i  <line && data[i][j] != 0 && total < (line * row)){
                list.add(data[i][j]);
                data[i++][j] = 0;
                total++;
            }
            i--;j--;
            while(j >= 0 && data[i][j] != 0 && total < (line * row)){
                list.add(data[i][j]);
                data[i][j--] = 0;
                total++;
            }
            i--;j++;
            while(i >= 0 && data[i][j] !=0 &&total < (line * row)){
                list.add(data[i][j]);
                data[i--][j] = 0;
                total++;
            }
            i++;j++;
        }
        System.out.println(list);

    }
}
