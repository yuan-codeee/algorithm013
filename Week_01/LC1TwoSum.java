package Week_01;

import java.util.*;

public class LC1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> items = new HashMap<>();
        int idx = -1;
        int val = 0;
        for (int i = 0; i < nums.length; i++) {
            val = target - nums[i];
            if (items.containsKey(val)) {
                idx = i;
                break;
            }
            items.put(nums[i], i);
        }
        return new int[] { items.get(val), idx };
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        LC1TwoSum test = new LC1TwoSum();
        int[] result = test.twoSum(nums, target);
        for (int num : result) {
            System.out.println(num);
        }

    }

}