public class Test2 {
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
        listNode m1 = new listNode(2);
        listNode m2 = new listNode(3);
        listNode m3 = new listNode(4);
        listNode m4 = new listNode(5);
        listNode m5 = new listNode(6);
        m1.next = m2;
        m2.next = m3;
        m3.next = m4;
        m4.next= m5;
        listNode head1 = l1;
        listNode head2 = m1;
        listNode dummy = new listNode();
        listNode cur = dummy;
        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                cur.next = head1;
                head1 = head1.next;
            }else{
                cur.next = head2;
                head2 = head2.next;
            }
            cur = cur.next;
        }
        cur.next = head1 != null ? head1 : head2;
        listNode he = dummy.next;
        while(he.next != null){

            System.out.println(he.val);
            he = he.next;
        }

    }
}
