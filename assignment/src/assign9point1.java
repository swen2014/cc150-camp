/**
 * Created by steven on 3/10/15.
 */
public class assign9point1 {
    // iterative
    public static int Countstair(int n){
        int dp[] = new int[n+1];
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else if (n == 3)
            return 4;
        else {
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            for (int i = 4; i < n + 1; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
            return dp[n];
        }
    }

    // recursive
    public static int countWaysDP(int n, int[] map) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (map[n] > 0) {
            return map[n];
        } else {
            // remember the line.
            map[n] = countWaysDP(n - 1, map) + countWaysDP(n - 2, map)
                    + countWaysDP(n - 3, map);
            System.out.println("*************** Sub-map[" + n + "] value ::" + map[n]);
            return map[n];
        }
    }
}
