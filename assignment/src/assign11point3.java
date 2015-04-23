/**
 * Created by steven on 3/17/15.
 */
public class assign11point3 {
    public static int rotateSearch(int[] arr, int target){
        int[] dou = new int[arr.length * 2];
        System.arraycopy(arr, 0, dou, 0, arr.length);
        System.arraycopy(arr, 0, dou, arr.length, dou.length);
        return helper(dou, 0, dou.length-1, target);
    }

    private static int helper(int[] arr, int l, int r, int tar){
        int mid = (l+r)/2;
        int tmp = arr[mid];
        int prev = mid;
        if (tmp > tar){
            mid = (prev+l)/2;
            if (arr[mid] < tmp && arr[mid] < tar){
                return helper(arr, l, mid, tar);
            }else {
                return helper(arr, mid, prev, tar);
            }
        }else if (tmp < tar){
            mid = (prev+r)/2;
            if (arr[mid] > tar && arr[mid] > tar){
                return helper(arr, mid, r, tar);
            }else {
                return helper(arr, prev, mid, tar);
            }
        }else {
            return mid;
        }
    }

    static int search(int[] a, int x) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (a[mid] == x) return mid;
            // left half sorted
            if (a[low] < a[mid]) {
                if (a[low] <= x && x < a[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            //right half sorted
            else {
                if (a[mid] < x && x <= a[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
