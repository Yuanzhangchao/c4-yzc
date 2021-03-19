import java.util.Scanner;
/*堆排序*/
public class Test12_Heapsort {
    public static void main(String args[]){
        Scanner in = new Scanner((System.in));
        int len = in.nextInt();
        int[] array = new int[len];
        for(int i = 0 ; i < len ; i++){
            array[i] = in.nextInt();
        }
        heapSort(array);
        for(int i : array ){
            System.out.print(i +" ");
        }
    }
    public static void heapSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            adjustHeap(array, i, array.length);  //调整堆
        }
        for (int j = array.length - 1; j > 0; j--) {
            swap(array, 0, j);
            adjustHeap(array, 0, j);
        }
    }
    public static void adjustHeap(int[] array, int i, int length) {
        // 先把当前元素取出来，因为当前元素可能要一直移动
        int temp = array[i];
        for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {  //2*i+1为左子树i的左子树(因为i是从0开始的),2*k+1为k的左子树
            // 让k先指向子节点中最大的节点
            if (k + 1 < length && array[k] < array[k + 1]) {  //如果有右子树,并且右子树大于左子树
                k++;
            }
            //如果发现结点(左右子结点)大于根结点，则进行值的交换
            if (array[k] > temp) {
                swap(array, i, k);
                // 如果子节点更换了，那么，以子节点为根的子树会受到影响,所以，循环对子节点所在的树继续进行判断
                i  =  k;
            } else {  //不用交换，直接终止循环
                break;
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
