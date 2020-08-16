package roundA.Heap;

import java.util.*;

/*
Name: 剑指　Offer 40. 最小的 k 个数
Link: https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 */

public class LCSO40 {
    public int[] solution1(int[] arr, int k) {
        /*
        Solution of brute force
         */
        List<Integer> res = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < k; i++) {
            res.add(arr[i]);
        }

        return res.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution2(int[] arr, int k) {
        /*
        Solution of using priority queue (heap)
         */
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }

        Queue<Integer> pq = new PriorityQueue<>((val1, val2) -> val2 - val1);
        for (int elem : arr) {
            if (pq.size() < k) {
                pq.offer(elem);
            } else if (pq.peek() > elem) {
                pq.poll();
                pq.offer(elem);
            }
        }

        return pq.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution3(int[] arr, int k) {
        /*
        Solution of using BST
         */
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }

        TreeMap<Integer, Integer> leastNums = new TreeMap<>();
        int count = 0;
        for (int elem : arr) {
            if (count < k) {
                leastNums.put(elem, leastNums.getOrDefault(elem, 0) + 1);
                count++;

                continue;
            }

            Map.Entry<Integer, Integer> lastEntry = leastNums.lastEntry();
            if (lastEntry.getKey() > elem) {
                leastNums.put(elem, leastNums.getOrDefault(elem, 0) + 1);
                if (lastEntry.getValue() == 1) {
                    leastNums.pollLastEntry();
                } else {
                    leastNums.put(lastEntry.getKey(), lastEntry.getValue() - 1);
                }
            }
        }

        int[] res = new int[k];
        int idx = 0;
        for (Map.Entry<Integer, Integer> curEntry : leastNums.entrySet()) {
            int freq = curEntry.getValue();
            while (freq-- > 0) {
                res[idx++] = curEntry.getKey();
            }
        }
        return  res;
    }

    public int[] getLeastNumbers(int[] arr, int k) {
//        return solution1(arr, k);
//        return solution2(arr, k);
        return solution3(arr, k);
    }

    public static void main(String[] args) {
        int[] data = new int[]{3, 2, 1};
        int k = 2;
        LCSO40 test = new LCSO40();
        int[] res = test.getLeastNumbers(data, k);

        for (int i : res) {
            System.out.println(i);
        }

    }
}
