package roundA.stack;

import java.util.*;

/*
Name: 20.有效的括号
Link: https://leetcode-cn.com/problems/valid-parentheses/
 */

public class LC20 {
    private HashMap<Character, Character> bracketMap;

    public LC20() {
        this.bracketMap = new HashMap<Character, Character>();
        this.bracketMap.put(')', '(');
        this.bracketMap.put('}', '{');
        this.bracketMap.put(']', '[');
    }

    public boolean isValid(String s) {
        Stack<Character> bracketStack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (this.bracketMap.containsKey(c)) {
                char bracket = bracketStack.isEmpty() ? '#' : bracketStack.pop();

                if (bracket != this.bracketMap.get(c)) {
                    return false;
                }
            } else {
                bracketStack.push(c);
            }
        }
        return bracketStack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = new String("()[]");
        String str2 = new String("([)]");
        LC20 test = new LC20();
        boolean result1 = test.isValid(str1);
        boolean result2 = test.isValid(str2);
        System.out.println(result1);
        System.out.println(result2);

    }
}
