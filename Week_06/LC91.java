package roundA.DP;

/*
Name: 91 解码方法
Link: https://leetcode-cn.com/problems/decode-ways/
 */

import java.util.Arrays;

public class LC91 {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0 || s.charAt(0) == '0')     return 0;
        int[] dp = new int [n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; ++i) {
            if (s.charAt(i - 2) == '1' || s.charAt(i - 2) == '2' && s.charAt(i - 1) <= '6')
                dp[i] += dp[i - 2];
            if (s.charAt(i - 1) != '0')
                dp[i] += dp[i - 1];
        }
        return dp[n];
    }
}
