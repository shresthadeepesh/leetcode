package com.techlink.leetcode.tree;

public class MaxDepth {

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        if(leftDepth > rightDepth) {
            return leftDepth + 1;
        }

        return rightDepth + 1;
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode first = new TreeNode(1, left, right);

        System.out.println(maxDepth(first));
    }

}
