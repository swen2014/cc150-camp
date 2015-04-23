/**
 * Created by steven on 3/10/15.
 */
public class assign9point2 {
    // 2 D DP  for such question the int[][] is always flipping x, y
    public static int FindpathDP(int x, int y){
        if (x <= 0 && y <= 0)
            return 0;
        int[][] dp = new int[y+1][x+1];

        for (int i=1;i<=x;i++){
            dp[0][i] = 1;
        }
        for (int j=1;j<=y;j++){
            dp[j][0] = 1;
        }
        for (int i=1;i<y+1;i++){
            for (int j=1;j<x+1;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[y][x];
    }
}
