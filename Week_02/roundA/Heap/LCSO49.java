package roundA.Heap;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/*
Name: 剑指　Offer 49. 丑数
Link: https://leetcode-cn.com/problems/chou-shu-lcof/
 */

public class LCSO49 {
    public int solution1(int n) {
        /*
        Solution of using heap
         */
        Queue<Long> uglyNums = new PriorityQueue<>();
        Set<Long> nums = new HashSet<>();
        int[] primes = new int[]{2, 3, 5};
        for (long num :  primes) {
            uglyNums.offer(num);
            nums.add(num);
        }

        long curUglyNum = 1;
        for (int i = 1; i < n; i++) {
            if (uglyNums.size() > 0) {
                curUglyNum = uglyNums.poll();
            }

            for (int j = 0; j < 3; j++) {
                long newUglyNum = curUglyNum * primes[j];
                if (!nums.contains(newUglyNum)) {
                    uglyNums.offer(newUglyNum);
                    nums.add(newUglyNum);
                }
            }
        }

        return (int) curUglyNum;
    }

    public int nthUglyNumber(int n) {
        return solution1(n);
    }

    public static void main(String[] args) {
        int n = 10;
        LCSO49 test = new LCSO49();
        int res = test.nthUglyNumber(n); // 12
        System.out.println(res);
    }
}
