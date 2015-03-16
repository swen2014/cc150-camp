import java.util.*;

/**
 * Created by steven on 3/11/15.
 */
public class assign9point4 {

    public List<List<Integer>> subsets(int[] S) {
        Arrays.sort(S);
        int totalNumber = 1 << S.length;// subset number is 2^n
        List<List<Integer>> collection = new ArrayList<List<Integer>>(totalNumber);
        for (int i=0; i<totalNumber; i++) {
            List<Integer> set = new LinkedList<Integer>();
            for (int j=0; j<S.length; j++) {
                if ((i & (1<<j)) != 0) {// all subset can be represented as binary 000 means null set,
                    set.add(S[j]);      // 110 means the second and third elements' set
                }
            }
            collection.add(set);
        }
        return collection;
    }
}
