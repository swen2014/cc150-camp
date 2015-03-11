/**
 * Created by steven on 1/14/15.
 */
import java.util.*;
/*Given two strings, write a method to decide if one is a permutation of the other.
* assume
* */

public class assign1point3 {
    public static void main(String[] args){
        String t1 = "abcd  ";
        String t2 = "  dcba";
        assign1point3 test = new assign1point3();
        boolean result = test.permutation(t1,t2);

        if(result)
            System.out.println("Same");
        else
            System.out.println("Not same");
    }

    public boolean permutation(String arg1, String arg2){
        String str1 = arg1.trim();//assume no whitespace in the string
        String str2 = arg2.trim();
        if(str1.length()!= str2.length())
            return false;

        int[] asc = new int[256];   //assume is ASCII

        char[] str1_array = str1.toCharArray();

       for(char c: str1_array ){
           asc[c]++;
       }

       for(int i = 0; i < str2.length(); i++){
           int c = str2.charAt(i);
           --asc[c];
           if(asc[c] <0)
               return false;
       }
       return true;
    }
}
