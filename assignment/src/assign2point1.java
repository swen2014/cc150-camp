import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by steven on 1/19/15.
 */

/*
* Function
* Remove Duplicated elements in the singly linked list
*
* */
public class assign2point1 {
    public void main(String[] args){
        ListNode a = new ListNode(1);
        ListNode result = rmvDup(a);
    }

    private static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

    }

    public static ListNode rmvDup(ListNode head){
        if(head == null | head.next == null)
            return head;
        ListNode point = null;
        HashSet cache = new HashSet();
        while (head != null){
            if(!cache.add(head.val)){
                point.next = head.next;
            }
            else {
                cache.add(head.val);
                point = head;
            }
            head = head.next;
        }
        return  head;
    }
}
