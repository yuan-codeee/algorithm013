package roundA.tree;

import java.util.*;

/*
Name: 589. N叉树的前序遍历
Link: https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 */

public class LC589 {
    public List<Integer> solution2(Node root) {
        /*
        Solution of iteration
         */
        Stack<Node> st = new Stack<>();
        List<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }

        st.push(root);
        while (!st.isEmpty()) {
            Node curNode = st.pop();
            if (curNode != null) {
                res.add(curNode.val);
            } else {
                continue;
            }

            Collections.reverse(curNode.children);
            curNode.children.forEach(node -> st.push(node));
        }

        return res;
    }

    public void preorderTraversal(Node node, List<Integer> res) {
        if (node == null) {
            return;
        }
        res.add(node.val);

        node.children.forEach(child -> preorderTraversal(child, res));
    }

    public List<Integer> solution1(Node root) {
        /*
        Solution of recursion
         */
        List<Integer> res = new ArrayList<>();
        preorderTraversal(root, res);
        return res;
    }

    public List<Integer> preorder(Node root) {
//        return solution1(root);
        return solution2(root);
    }

    public static void main(String[] args) {

    }
}
