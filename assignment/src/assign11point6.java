/**
 * Created by steven on 3/29/15.
 */
public class assign11point6 {
    public int[] matrixSearcj(int[][] a, int tar){
        if (a==null)
            return new int[] {-1, -1};
        int i=0, j=a[0].length-1;
        while (i<a.length && j>=0){
            if (a[i][j] == tar){
                return new int[] {i, j};
            }
            if (a[i][j] < tar){
                i++;
            }else {
                j--;
            }
        }
        return new int[] {-1, -1};
    }
}
