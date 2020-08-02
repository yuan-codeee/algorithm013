package Week_01;

public class LC66PlusOne {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        for (int i = size - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            if (i == 0) {
                digits = new int[size + 1];
                digits[0] = 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        // int[] nums = new int[]{4, 3, 2, 1};
        // int[] nums = new int[]{0};
        int[] nums = new int[] { 9 };
        LC66PlusOne test = new LC66PlusOne();
        nums = test.plusOne(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
