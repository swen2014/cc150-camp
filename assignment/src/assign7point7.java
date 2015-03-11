import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by steven on 2/21/15.
 */
public class assign7point7 {

    public static int getKthNum(int k)
    {
        if(k == 0)
            return 0;
        ArrayDeque<Integer> Q3 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> Q5 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> Q7 = new ArrayDeque<Integer>();
        Q3.push(1);
        int val = Integer.MAX_VALUE;
        for(int i = 0; i <=k;++i)
        {
            int v3 = Q3.size() == 0?Integer.MAX_VALUE:Q3.getFirst();
            int v5 = Q5.size() == 0?Integer.MAX_VALUE:Q5.getFirst();
            int v7 = Q7.size() == 0?Integer.MAX_VALUE:Q7.getFirst();
            val = min(v3,min(v5,v7));
            if(val == v3)
            {
                Q3.poll();
                Q3.add(val*3);
                Q5.add(val*5);
            }
            else if(val == v5)
            {
                Q5.poll();
                Q5.add(val*5);
            }
            else if(val == v7)
            {
                Q7.poll();
            }
            Q7.add(val*7);
        }
        return val;
    }

    public static int min(int a, int b){
        return a > b? b:a;
    }
}
