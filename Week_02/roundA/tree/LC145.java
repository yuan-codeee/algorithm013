package roundA.tree;

import java.util.*;

/*
Name: 145. 二叉树的后序遍历
Link: https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 */

public class LC145 {
    public List<Integer> postorderTraversalIteration(BinaryTreeNode root) {
        /*
        Solution of iteration
         */
        Stack<BinaryTreeNode> st = new Stack();
        List<Integer> res = new ArrayList<>();

        st.push(root);

        while (!st.isEmpty()) {
            BinaryTreeNode curNode = st.pop();
            if (curNode != null) {
                res.add(curNode.val);
            } else {
                continue;
            }
            st.push(root.left);
            st.push(root.right);
        }
        Collections.reverse(res);
        return res;
    }


    public void traversal(BinaryTreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        traversal(root.left, res);
        traversal(root.right, res);
        res.add(root.val);
    }

    public List<Integer> postorderTraversal(BinaryTreeNode root) {
        /*
        Solution of recursion
         */
        List<Integer> res = new ArrayList<>();
        this.traversal(root, res);
        return res;
    }

    public static void main(String[] args) {

    }
}
