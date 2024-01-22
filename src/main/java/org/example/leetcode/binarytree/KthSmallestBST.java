package org.example.leetcode.binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class KthSmallestBST {



    Stack<Integer> kthSmallest =  new Stack<>();
    public int kthSmallest(TreeNode root, int k) {
        dfs(root );
        Collections.sort(kthSmallest);
        return kthSmallest.get(k-1);
    }

    public void dfs (TreeNode curr){
        if(curr==null) return;
         kthSmallest.push(curr.val);
         dfs(curr.left);
         dfs(curr.right);
    }

    // O(n) , iterative stack
//    public int kthSmallest(TreeNode root, int k) {
//        Stack<TreeNode> stack = new Stack<>();
//        stack.add(root);
//        while(root!=null || !stack.isEmpty()) {
//            //left
//            while(root!=null){
//                stack.push(root);
//                root = root.left;
//            }
//            root = stack.pop();
//            --k;
//            if(k==0){break;}
//            root=root.right;
//            //right
//        }
//        return root.val;
//    }

        // O(n) , recursive, inorder
//    public int kthSmallest(TreeNode root, int k) {
//        int[] nums = new int[2];
//        inorder(root,nums,k);
//        return nums[1];
//    }
//    // poseti sve levo  u redu
//    public void inorder(TreeNode root, int[] nums, int k){
//        if(root==null) return;
//        inorder(root.left,nums,k);
//        if(++nums[0]==k){
//            nums[1]=root.val;
//            return;
//        }
//        inorder(root.right,nums,k);
//    }
}
