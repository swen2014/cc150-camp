/**
 * Created by steven on 4/12/15.
 */
public class assign17point8 {
    static int findContiguousSum(int[] arr) throws Exception{
        if (arr == null || arr.length <1)
            throw new Exception("error");

        int[] dp = new int[arr.length];
        int max = arr[0];
        dp[0] = arr[0];
        for (int i=1; i<arr.length; i++){
            dp[i] = (dp[i-1]+arr[i])>arr[i]? dp[i-1]+arr[i]:arr[i];
            max = max >= dp[i]? max:dp[i];
        }
        return dp[arr.length-1];
    }
}
