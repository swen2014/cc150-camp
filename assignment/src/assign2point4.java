import java.util.LinkedList;

/**
 * Created by steven on 1/19/15.
 */

/*
* Function
*
* */
public class assign2point4 {

    private static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

    }

    public static ListNode xDivide(ListNode head, int x){
        ListNode firsttail = null;
        ListNode secondtail = null;
        ListNode firsthead = null;
        ListNode secondhead = null;

        while (head != null){
            if(head.val < x) {
                if (firsthead == null) {
                    firsthead.val = head.val;
                    firsthead.next = firsttail;
                } else {
                    //firsttail.val = head.val;
                    //firsttail.next = head.next;
                    firsttail = head;
                    firsttail = firsttail.next;
                }
            }
            else {
                if (secondhead == null) {
                    secondhead.val = head.val;
                    secondhead.next = secondtail;
                } else {
                    secondtail.val = head.val;
                    secondtail.next = head.next;
                    secondtail = secondtail.next;
                }
            }
            head = head.next;
        }
        firsttail.val = secondhead.val;
        firsttail.next = secondhead.next;
        secondtail = null;
        secondtail.next = null;
        return firsthead;
    }
}
