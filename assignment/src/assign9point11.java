import java.util.HashMap;

/**
 * Created by steven on 3/23/15.
 */

public class assign9point11 {
    static int count(String exp, boolean res, int s, int e, HashMap<String, Integer> cache) {
        String key = "" + res + s + e;
        if (cache.containsKey(key))
            return cache.get(key);

        if (s == e) { //base case
            if (exp.charAt(s) == '1' && res)
                return 1;
            if (exp.charAt(s) == '0' && !res)
                return 1;
            return 0;
        }
        int cnt = 0;
        if (res) {
            for (int i = s+1; i <= e; i+=2) {// i is index of an operator
                if (exp.charAt(i) == '&') {
                    cnt += count(exp, true, s, i-1, cache) * count(exp, true, i+1, e, cache);
                }
                else if (exp.charAt(i) == '|') {
                    cnt += count(exp, true, s, i-1, cache) * count(exp, true, i+1, e, cache) +
                            count(exp, true, s, i-1, cache) * count(exp, false, i+1, e, cache) +
                            count(exp, false, s, i-1, cache) * count(exp, true, i+1, e, cache);
                }
                else if (exp.charAt(i) == '^') {
                    cnt += count(exp, true, s, i-1, cache) * count(exp, false, i+1, e, cache) +
                            count(exp, false, s, i-1, cache) * count(exp, true, i+1, e, cache);
                }
            }
        }
        else {
            for (int i = s+1; i <= e; i+=2) {// i is index of an operator
                if (exp.charAt(i) == '&') {
                    cnt += count(exp, false, s, i-1, cache) * count(exp, false, i+1, e, cache) +
                            count(exp, true, s, i-1, cache) * count(exp, false, i+1, e, cache) +
                            count(exp, false, s, i-1, cache) * count(exp, true, i+1, e, cache);
                }
                else if (exp.charAt(i) == '|') {
                    cnt += count(exp, false, s, i-1, cache) * count(exp, false, i+1, e, cache);
                }
                else if (exp.charAt(i) == '^') {
                    cnt += count(exp, true, s, i-1, cache) * count(exp, true, i+1, e, cache) +
                            count(exp, false, s, i-1, cache) * count(exp, false, i+1, e, cache);
                }
            }
        }
        cache.put(key, cnt);
        return cnt;
    }

    static int countDP(String exp, boolean res, HashMap<String, Integer> cache) {
        return count(exp, res, 0, exp.length()-1, cache);
    }

//    static int count(String exp, boolean res) {
//        return count(exp, res, 0, exp.length()-1);
//    }

}
