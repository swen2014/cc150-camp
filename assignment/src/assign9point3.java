import java.util.ArrayList;
import java.util.List;

/**
 * Created by steven on 3/10/15.
 */

/*A magic index in an array A[l...n-l] is defined to be an index
such that A[i] = i. Given a sorted array of distinct integers,
write a method to find a magic index, if one exists, in array A.
FOLLOW UP
What if the values are not distinct?
* */
public class assign9point3 {
    public static int Magicindex(int[] arr){
        return Magicindex(arr, 0, arr.length-1);
    }

    public static int Magicindex(int[] arr, int start, int end){
        if (start > end)
            return -1;
        if (start == end - 1)
            return Magicindex(arr,end,end);
        int mid = (start+end)/2;
        if (arr[mid] == mid){
            return mid;
        }else if (arr[mid] > mid){
            return Magicindex(arr, start, mid-1);
        }else{
            return Magicindex(arr, mid+1, end);
        }
    }


    public static void magicindex(int[] arr, int start, int end, ArrayList ans){
        if (start > end){
            return;
        }
        int mid = (start+end)/2;
        if (arr[mid] == mid){
             ans.add(mid);
        }

        int left = Math.min(arr[mid], mid-1);
        magicindex(arr, start, left, ans);

        int right = Math.max(arr[mid], mid+1);
        magicindex(arr, right, end, ans);
    }

}
