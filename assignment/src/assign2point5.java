/**
 * Created by steven on 1/28/15.
 */
public class assign2point5 {

    private static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode sum(ListNode l1, ListNode l2){
        int jinwei = 0;
        ListNode pointer1 = l1;
        ListNode pointer2 = l2;
        ListNode head = new ListNode(0);
        ListNode result = head;


        while(pointer1 !=null | pointer2 != null){
            int cache = jinwei;

            if(pointer1 != null) {
                cache = pointer1.val + cache;
                pointer1 = pointer1.next;
            }
            if(pointer2 != null) {
                cache = pointer2.val + cache;
                pointer2 = pointer2.next;
            }
            if(cache >9){
                jinwei = 1;
            }
            else jinwei = 0;

            result.next = new ListNode(cache % 10);
            result = result.next;
        }

        if(jinwei == 1){
            result.next = new ListNode(1);
        }

        return head.next;

    }

}
