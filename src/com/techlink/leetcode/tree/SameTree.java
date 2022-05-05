package com.techlink.leetcode.tree;

public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(q == null || p == null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode first = new TreeNode(1, left, right);

        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        TreeNode second = new TreeNode(1, left1, right1);

        System.out.println(isSameTree(first, second));

    }

}
