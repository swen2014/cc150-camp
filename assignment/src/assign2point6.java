/**
 * Created by steven on 1/26/15.
 */
public class assign2point6 {
    public void main(String[] args){

    }

    private static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode findLoop(ListNode l){
        if(l == null | l.next == null){
            return l;
        }
        ListNode fast = l, slow = l,head = l;
        int step = 0;
        while(fast != slow){
            step++;
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(step);

        while (head != fast){
            head = head.next;
            slow = slow.next;
        }

        return slow;
    }
}
