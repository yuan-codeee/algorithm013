package roundA.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Name: 77 组合
Link: https://leetcode-cn.com/problems/combinations/
 */

public class LC77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (k > n || k < 0) {
            return result;
        }
        if (k == 0) {
            result.add(new ArrayList<Integer>());
            return result;
        }
        result = combine(n - 1, k - 1);

        for (List<Integer> list : result) {
            list.add(n);
        }
        result.addAll(combine(n - 1, k));
        return result;
    }

    public static void main(String[] args) {

    }
}
