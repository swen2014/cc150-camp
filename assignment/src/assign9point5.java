/**
 * Created by steven on 3/12/15.
 *
 *
 * Write a method to compute all permutations of a string.
 */
import java.util.*;
// O(n!) time
public class assign9point5 {
    public static ArrayList<String> permute(String str) {
        if (str == null)
            return null;
        ArrayList<String> per = new ArrayList<String>();
        if (str.length() == 0){
            per.add("");
            return per;
        }
        char first = str.charAt(0);
        ArrayList<String> prev = permute(str.substring(1));
        for (String n: prev){
            for (int i=0;i<=n.length();i++){ // "<=" ** for a string ab length=2, we had to insert c into 3 places
                String cur = insert(n,i,first);
                per.add(cur);
            }
        }
        return per;
    }

    private static String insert(String n, int i, char a){
        String front = n.substring(0, i);
        String rear = n.substring(i);
        return front+a+rear;
    }
}
