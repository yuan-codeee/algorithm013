package Week_04.Greedy;

/*
Name: 455 分发饼干
Link: https://leetcode-cn.com/problems/assign-cookies/description/
 */

import java.util.Arrays;

public class LC455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for (int j = 0; i < g.length && j < s.length; j++) {
            if (g[i] <= s[j]) {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {

    }
}
