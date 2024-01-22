package org.example.leetcode.binarytree;

public class ValidateBinaryTree {

    public boolean isValidBST(TreeNode root) {
        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean valid(TreeNode curr, long minValue, long maxValue){
        if(curr==null) return true;
        if(!(curr.val >minValue && curr.val<maxValue)){
            return false;
        }
        return valid(curr.left,minValue,curr.val) && valid(curr.right, curr.val, maxValue);
    }
}
