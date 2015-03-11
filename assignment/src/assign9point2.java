/**
 * Created by steven on 3/10/15.
 */
public class assign9point2 {
    public static int FindpathDP(int x, int y){
        if (x <= 0 && y <= 0)
            return 0;
        int[][] dp = new int[x+1][y+1];

        for (int i=1;i<=x+1;i++){
            dp[0][i] = 1;
        }
        for (int j=1;j<=y+1;j++){
            dp[j][0] = 1;
        }
        for (int i=1;i<y+2;i++){
            for (int j=1;j<x+2;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[x+1][y+1];
    }
}
