/**
 * Created by steven on 3/10/15.
 */
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
            return Magicindex(arr, start, mid);
        }else{
            return Magicindex(arr, mid, end);
        }
    }

}
