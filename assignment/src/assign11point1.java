/**
 * Created by steven on 3/24/15.
 */
public class assign11point1 {
    // Start comparing and mergeing from the tail
    public void mergeArr(int[] A, int[] B){
        if (B == null || B.length ==0)
            return;
        if (A.length < B.length){
            return;
        }
        int i=1;
        while (A[i] >= A[i-1] ){
            i++;
        }
        i--;
        int j = B.length-1, k=j+i+1;
        while (i>=0 && j>=0){
            if (A[i] >= B[j]){
                A[k] = A[i--];
            }else {
                A[k] = B[j--];
            }
            k--;
        }
        while (i>=0){
            A[k--] = A[i--];
        }
        while (j>=0){
            A[k--] = B[j--];
        }
    }
}
