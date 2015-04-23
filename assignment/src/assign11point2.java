import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by steven on 3/17/15.
 */
public abstract class assign11point2 {

    class AnagramComparator implements Comparator<String> {
    private String stringPer(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return arr.toString();
    }

    @Override
    public int compare(String o1, String o2) {
//        String sort1 = sort(o1);
//        String sort2 = sort(o2);
        return stringPer(o1).compareTo(stringPer(o2));
    }
}

        //wrong
//    private static boolean compare1 (String a, String b){
//        if (a.length() != b.length())
//            return false;
//        char[] ac = stringPer(a);
//        char[] bc = stringPer(b);
//        for (int i=0; i< a.length(); i++){
//            if (ac[i] != bc[i]){
//                return false;
//            }
//        }
//        return true;
//    }

    static void sortStrings(String[] strings) {
        HashMap<String, LinkedList<String>> cache = new HashMap<String, LinkedList<String>>();
        for (String s : strings) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (cache.containsKey(key)) {
                cache.get(key).add(s);
            }
            else {
                LinkedList<String> list = new LinkedList<String>();
                list.add(s);
                cache.put(key, list);
            }
        }
        int i = 0;
        for (String key : cache.keySet()) {
            for (String val : cache.get(key)) {
                strings[i++] = val;
            }
        }
    }
}
