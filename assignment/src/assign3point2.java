import java.util.Stack;

/**
 * Created by steven on 1/28/15.
 */
public class assign3point2 {
    Stack<Integer> min;
    Stack<Integer> normal;

    public void push(int a){
        if (normal.isEmpty()){
            min.push(a);
        }
        if (a <= min.peek()){
            min.push(a);
        }
        normal.push(a);

    }

    public void pop(){
        int result = normal.pop().intValue();
        if (result == min.peek()){
            min.pop();
        }
        //return result;
    }

    public int peek(){
        return normal.peek();
    }

    public int getMin() throws Exception{
        if (min.isEmpty()){
            throw new Exception("Nothing in the stack");
        }
        return min.peek();
    }

}
