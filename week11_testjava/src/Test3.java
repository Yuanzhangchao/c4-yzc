import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        listNode l1 = new listNode(1);
        listNode l2 = new listNode(2);
        listNode l3 = new listNode(3);
        listNode l4 = new listNode(2);
        listNode l5 = new listNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next= l5;
        List<Integer> vals;
        vals = new ArrayList<Integer>();


        listNode currentNode = l1;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }


        boolean temp = true;
        int front = 0;
        int back = vals.size() - 1;
        while (front < back) {
            if (!vals.get(front).equals(vals.get(back)) && temp) {
                System.out.println("false");
                temp = false;
            }
            front++;
            back--;
        }
        if(temp)
             System.out.println("true");
    }
}

