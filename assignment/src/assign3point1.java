/**
 * Created by steven on 1/28/15.
 */
public class assign3point1 {
    public void main(String[] args){

    }

    public class mystack{
        int sizeall = 100;
        int[] cache = new int[sizeall *3];
        int[] stacktop = {-1,-1,-1};  //

        void push(int stacknum, int a) throws Exception {
            if(stacktop[stacknum]+1 > sizeall){
                throw new Exception("Out of stack");
            }
            stacktop[stacknum]++;
            cache[stacknum*sizeall + stacktop[stacknum]] = a;
        }

        int pop(int stacknum) throws Exception{
            if(stacktop[stacknum] - 1 < -1){
                throw new Exception("Stack empty already");
            }
            int result = cache[stacknum * sizeall + stacktop[stacknum]];
            cache[stacknum * sizeall + stacktop[stacknum]] = 0;
            stacktop[stacknum]--;
            return result;
        }

        int peek(int stacknum) throws Exception{
            if (stacktop[stacknum] == -1){
                throw new Exception("This is a empty stack");
            }
            return cache[stacknum * sizeall + stacktop[stacknum]];
        }
    }


}
