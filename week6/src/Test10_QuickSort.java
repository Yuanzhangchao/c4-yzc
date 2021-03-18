import java.util.Scanner;

/*快速排序*/
public class Test10_QuickSort {
    public static void main(String[] args) {
        System.out.print("输入数组的个数：");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] data = new int[len];
        System.out.println("输入数组元素：");
        for(int i = 0 ; i < len ; i++){
            data[i] = in.nextInt();
        }
        //开始快速排序
        quickSort(data,0,data.length -1);
        for(int k : data){
            System.out.print(k +" ");
        }

    }
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int index = getIndex(arr,low,high);
            //递归
            quickSort(arr,low,index -1); //前半部分
            quickSort(arr,index+1,high);//s后半部分
        }
    }
    public static int getIndex(int[] arr , int low, int high){
        int temp = arr[low];
        while(low < high){
            while(low < high && arr[high] >= temp){
                high--;
            }
            arr[low] = arr[high];
            while(low < high && arr[low] <= temp){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }
}
