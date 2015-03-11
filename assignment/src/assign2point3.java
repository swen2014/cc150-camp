import java.util.LinkedList;

/**
 * Created by steven on 1/19/15.
 */

/*
* Function
* Delete a node that in the linked list but it can't be the last one
*
* */
public class assign2point3 {

    private static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

    }

    public static void deleteNode(ListNode mid){
        if(mid == null | mid.next == null)
            return;
        mid.val = mid.next.val;
        mid.next = mid.next.next;
    }
}
