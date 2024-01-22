package org.example.leetcode.binarytree;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        // recursivly
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
//    public int maxDepth(TreeNode root) {
//
//    }
}
