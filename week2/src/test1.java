import java.util.Scanner;

public class test1 {
    public static void main(String args[]){
        int n ;
        Scanner in  = new Scanner(System.in);
        n = in.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < n ; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        int[][] tt = new int[n][n];
        for(int i = 0 ; i < n  ; i++){
            for(int  j = 0 ; j < n ;j++){
                tt[i][j] = matrix[n-1-j][i];
            }
        }
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(tt[i][j] + " ");
            }
            System.out.println();
        }
    }
}
