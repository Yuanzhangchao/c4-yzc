import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*合并排序*/
public class Test11_MergeSort {
    public static  void main(String args[]){
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] data = new int[len];
        for(int i = 0 ; i < len ;i++){
            data[i] = in.nextInt();
        }
        mergeSort(data);
        for(int k : data){
            System.out.print(k + " ");
        }

    }
    public static void mergeSort(int[] array){
        int length = array.length;
        int middle = length/2;
        if(length > 1){
            int[] left = Arrays.copyOfRange(array,0,middle);
            int[] right = Arrays.copyOfRange(array,middle,length);
            mergeSort(left);
            mergeSort(right);
            merge(array,left,right);
        }

    }
    public static void merge(int[] result,int[] left,int[] right){
        int i = 0,l = 0, r = 0;
        while(l < left.length && r < right.length){
            if(left[l] < right[r]){
                result[i] = left[l];
                i++;
                l++;
            }
            else{
                result[i] = right[r];
                i++;
                r++;
            }
        }
        while(r < right.length){
            result[i] = right[r];
            r++;
            i++;
        }
        while(l < left.length){
            result[i] = left[l];
            l++;
            i++;
        }
    }
}
