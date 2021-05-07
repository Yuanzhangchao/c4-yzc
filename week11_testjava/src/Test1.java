public class Test1 {

    public static void main(String[] args) {

        listNode l1 = new listNode(1);
        listNode l2 = new listNode(2);
        listNode l3 = new listNode(3);
        listNode l4 = new listNode(4);
        listNode l5 = new listNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next= l5;
        listNode head = l1;
        listNode prev = null;
        while(head != null){
            listNode mext = head.next;
            head.next = prev;
            prev = head;
            head = mext;
        }
        while(prev!= null){
            System.out.println(prev.val);
            prev = prev.next;
        }
    }
}
