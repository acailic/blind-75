package org.example.leetcode.test;

import org.example.leetcode.binarytree.TreeNode;

public class CheckBinarySearchTree {
    // bst is a binary tree in which the value of each
    // left child node is less than or equal to the value
    // of the parent node, and the value of each right child node is greater
    // than or equal to
    // the value of the parent node.
    public static TreeNode prev ;
    public static void main(String[] args) {
        CheckBinarySearchTree checkBinarySearchTree = new CheckBinarySearchTree();
        TreeNode root = new TreeNode(2);
        root.left=new TreeNode(1);
        root.right=new TreeNode(3);
        System.out.println(checkBinarySearchTree.isValidBST(root));
    }

    public static boolean isValidBST(TreeNode root){
        prev=null;
        return inOrder(root);
    }

    public static boolean inOrder(TreeNode root) {
        if(root==null) return true;
        if(!inOrder(root.left)) return false;

        if(prev!=null && root.val<prev.val){
            return false;
        }
        prev=root;
        return inOrder(root.right);
    }
}
