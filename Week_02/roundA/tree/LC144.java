package roundA.tree;

import java.util.*;

/*
Name: 144. 二叉树的前序遍历
Link: https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 */

public class LC144 {
    public void traversal(BinaryTreeNode node, List<Integer> vals) {
        if (node == null) {
            return;
        };
        vals.add(node.val);
        traversal(node.left, vals);
        traversal(node.right, vals);
    }

    public List<Integer> preorderTraversal(BinaryTreeNode root) {
        /*
        Solution of recursion
         */
        List<Integer> vals = new ArrayList<>();
        this.traversal(root, vals);
        return vals;
    }

    public List<Integer> preorderTraversalIteration(BinaryTreeNode root) {
        /*
        Solution of iteration
         */
        List<Integer> vals = new ArrayList<>();
        Stack<BinaryTreeNode> st = new Stack<>();

        st.push(root);
        while (!st.isEmpty()) {
            BinaryTreeNode curNode = st.pop();
            if (curNode != null) {
                vals.add(curNode.val);
            } else {
                continue;
            }
            st.push(curNode.left);
            st.push(curNode.right);
        }

        return vals;
    }

    public static void main(String[] args) {

    }
}
