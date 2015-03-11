import java.util.LinkedList;

/**
 * Created by steven on 1/19/15.
 */


/*
* Function
* Find the k th element from the end of the linkedlist
* */
public class assign2point2 {

    private static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

    }

    public static ListNode kth(ListNode head, int k){
        ListNode p1 = head;
        ListNode p2 = head;
        int count = 0;
        while(p1 != null){
            p1 = p1.next;
            count ++;
        }
        for(int i=0; i< count -k-1; i++){
            p2 = p2.next;
        }
        return p2;
    }
}
