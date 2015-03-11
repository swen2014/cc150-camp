/**
 * Created by steven on 1/14/15.
 */
/*Implement an algorithm to determine if a string has all unique characters. What if
you cannot use additional data structures?
*/
import java.util.*;

public class assign1point1 {
    public static void main(String[] args){

        String str = "GAVgav";
        //HashSet hashSet = new HashSet(str.length());
/*        boolean result;
        for(char word : str.toCharArray()){ //iterate through character array
            if(!hashSet.add(Character.toUpperCase(word)))//try to add each char to hashset
                result = false; //return false if could not add
        }
        result = true;*/
        assign1point1 uc = new assign1point1();
        boolean result = uc.checkUnique(str);
        if(result)
            System.out.println("String has all unique characters.");
        else
            System.out.println("String does not have all unique characters.");
//        String a = assign1point5.stringCompression(str);
    }

    public boolean checkUnique(String str){
        if(str.length()>256)//Assume that the coding format is ASCII
            return false;

        HashSet hSet = new HashSet(str.length());

        for(char letter : str.toCharArray()){ //iterate through character array
            if(!hSet.add(letter))//try to add each char to hashset
                return false; //return false if could not add
        }
        return true;
    }
}
