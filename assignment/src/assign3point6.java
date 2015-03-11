import java.util.IllegalFormatException;
import java.util.Stack;

/**
 * Created by steven on 1/29/15.
 */
public class assign3point6 {

    public class sortStack{

        private Stack<Integer> a = new Stack<Integer>();
        private Stack<Integer> b = new Stack<Integer>();
        int temp ;

        public  void sort(Stack<Integer> a , Stack<Integer> b ){
            while (!a.isEmpty()){
                int cache = a.pop();
                while (!b.isEmpty() && b.peek() > cache){
                    a.push(b.pop());
                }
                b.push(cache);
            }
        }
    }
}
