import java.util.Stack;

/**
 * Created by steven on 1/26/15.
 */

/*
* Add two number of linked list from least significant digit to highest
*
* */
public class assign2pint5_2 {
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

    public static int listLength(ListNode l){
        int len= 0;
        while(l !=null){
            len++;
            l = l.next;
        }
        return len;
    }

    public static class smallSum{
        public ListNode sum = null;
        public int carry = 0;
    }

    public static smallSum add(ListNode l1, ListNode l2){
        if(l1 == null && l2 == null){
            smallSum sum = new smallSum();
            return sum;
        }
        smallSum sum = add(l1.next, l2.next);

        int cache = sum.carry + l1.val + l2.val;

        ListNode up = new ListNode(cache %10);
        up.next = sum.sum;

        sum.sum = up;
        sum.carry = cache/10;
        return sum;
    }
    public static ListNode addDiff(ListNode l1, ListNode l2,int a, int b){

        if(a>b){
            ListNode p = l1;
            int diff = a - b;
            while (diff > 1){
                p = p.next;
            }
            smallSum result1 = add(p.next,l2);
            if(result1.carry == 1){
                ListNode high1 = new ListNode(1+p.val);
                high1.next = result1.sum;
                p = high1;
            }
            else {
                p.next = result1.sum;
            }
            return p;
        }
        else {
            ListNode p = l2;
            int diff = b -a;
            while (diff > 1){
                p = p.next;
            }
            smallSum result2 = add(p.next,l1);
            if(result2.carry == 1){
                ListNode high2 = new ListNode(1+p.val);
                high2.next = result2.sum;
                p = high2;
            }
            else {
                p.next = result2.sum;
            }
            return p;
        }
    }

    public static ListNode sumR(ListNode l1, ListNode l2){
        if(l1 != null && l2 != null) {
            int len1 = listLength(l1), len2 = listLength(l2);
            if (listLength(l1) == listLength(l2)) {
                smallSum result = add(l1, l2);
                if (result.carry == 1) {
                    ListNode high = new ListNode(1);
                    high.next = result.sum;
                    result.sum = high;
                }
                return result.sum;
            }
            else{
                return addDiff(l1,l2,len1,len2);
            }
        }

        else{
            if(l1 == null && l2 == null){
                return null;
            }
            else if(l1 == null){
                return l2;
            }
            else{
                return l1;
            }
        }
    }
}
