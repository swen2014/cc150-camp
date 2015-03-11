import java.util.Stack;

/**
 * Created by steven on 1/26/15.
 */
public class assign2point7 {
    public static void main(String arg){

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


    public static boolean isPolidrone(ListNode l){
        if(l != null | l.next != null) {
            ListNode pointer = l;
            int i = 0;
            boolean odd;
            int length = listLength(l);
            if (length % 2 == 0) {
                i = length/2;
                odd =false;
            }
            else{
                 i = (length-1)/2;
                odd = true;
            }

            Stack<Integer> stack = new Stack<Integer>();

            while(i >0){
                stack.push(pointer.val);
                pointer = pointer.next;
                i--;
            }
            if(odd){
                pointer = pointer.next;
            }
            while (pointer != null){
                int compare = stack.pop().intValue();
                if(compare == pointer.val) {
                    pointer = pointer.next;
                }
                else{
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
}
