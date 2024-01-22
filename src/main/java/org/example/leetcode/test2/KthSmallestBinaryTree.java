package org.example.leetcode.test2;

import org.example.leetcode.binarytree.TreeNode;

import java.util.Collections;
import java.util.Stack;

public class KthSmallestBinaryTree {
//
//    Given the root of a binary search tree, and an integer k,
//            return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
//
    public static void main(String[] args) {
        KthSmallestBinaryTree kthSmallestBinaryTree = new KthSmallestBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left=new TreeNode(1);
        root.right=new TreeNode(4);
        root.left.right=new TreeNode(2);
        System.out.println(kthSmallestBinaryTree.kthSmallest(root, 2));
        //larger tree to test,like 4 nodes
        TreeNode root2 = new TreeNode(5);
        root2.left=new TreeNode(3);
        root2.right=new TreeNode(6);
        root2.left.left=new TreeNode(2);
        root2.left.right=new TreeNode(4);
        root2.left.left.left=new TreeNode(1);
        System.out.println(kthSmallestBinaryTree.kthSmallest(root2, 3));
        // answer on 3 is 3

    }

    int count = 0;
    int result = 0;
    public int kthSmallest(TreeNode root, int k) {
        traverse(root,k);
        return  result;
    }

    public void traverse(TreeNode node, int k){
        if(node==null) return;
        traverse(node.left,k);
        count++;
        if(count==k){
            result= node.val;
            return;
        }
        traverse(node.right,k);
    }


    // 1. DFS and sort.
    // Time complexity: O(NlogN), where N is the number of nodes in the BST.
    // Space complexity: O(N), the size of stack.
    Stack<Integer> stack;
    public int kthSmallest1(TreeNode root, int k) {
        stack= new Stack<>();
        dfs(root);
        Collections.sort(stack);
        return stack.get(k-1);
    }

    private void dfs(TreeNode root) {
        if(root==null) return;
        stack.push(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
