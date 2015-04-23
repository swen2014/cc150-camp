/**
 * Created by steven on 4/13/15.
 */
public class assign17point6 {
    static int regionSort(int[] arr){
        if (arr.length < 0)
            return -1;
        int l=0, r=arr.length-1;
        for(int i=1; i<arr.length; i++){
            if (arr[i]<arr[i-1]) {
                l = i;
                break;
            }
        }
        for(int i=arr.length-2; i > l; i--){
            if (arr[i]>arr[i+1]) {
                r = i;
                break;
            }
        }
        int min = findMinMax(arr, l, r)[0];
        int max = findMinMax(arr, l, r)[1];
        while (!(arr[l]<=min && arr[r]>=max)){
            if (min < arr[l]){
                l--;
            }
            if (max > arr[r]){
                r++;
            }
            min = findMinMax(arr, l, r)[0];
            max = findMinMax(arr, l, r)[1];
        }
        System.out.println(l+","+r);
        return r-l;
    }

    private static int[] findMinMax(int[] arr, int l, int r){
        int[] res = new int[2];
        res[0] = arr[l];
        res[1] = arr[r];
        for (int indx=l+1; indx<=r; indx++){
            res[0] = res[0] < arr[indx]? res[0]: arr[indx];
            res[1] = res[1] > arr[indx]? res[1]: arr[indx];
        }
        return res;
    }

//    private static int findMax(int[] arr, int l, int r){
//        int max = arr[l];
//        for (int indx=l+1; indx<=r; indx++){
//
//        }
//        return max;
//    }
}
