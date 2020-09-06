package roundA.DP;

/*
Name: 64 最小路径和
Link: https://leetcode-cn.com/problems/minimum-path-sum/
 */

import java.util.*;

public class LC64 {
    public int minPathSum(int[][] grid) {
        int [] dp = new int[grid[0].length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 0; i < grid.length; i++){
            dp[0] = dp[0]+grid[i][0];
            for(int j = 1; j < grid[i].length; j++){
                dp[j] = Math.min(dp[j-1], dp[j]) + grid[i][j];
            }
        }
        return dp[grid[0].length-1];
    }
}
