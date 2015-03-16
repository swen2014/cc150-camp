/**
 * Created by steven on 3/14/15.
 */
public class SneakSearch {
    //    Given an M x N matrix in which each row and each column is sorted in ascending
//    order, write a method to find an element.

    // returns index [i, j]
    static int[] snakeSearch(int[][] m, int x) {
        if (m == null) return new int[] {-1, -1};
        int i = 0;
        int j = m[0].length - 1;
        while (i <= m.length && j >= 0) {
            if (m[i][j] == x) return new int[] {i, j};
            else if (m[i][j] > x) --j;
            else ++i;
        }
        return new int[] {-1, -1};
    }
}
