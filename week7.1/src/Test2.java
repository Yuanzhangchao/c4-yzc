import java.util.Stack;

public class Test2 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {4,5,3,2,1};
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for(int num :nums1){
            stack.push(num);
            while(!stack.isEmpty() && stack.peek() == nums2[index]){
                stack.pop();
                index++;
            }
        }
        System.out.println(stack.isEmpty());
    }
}
