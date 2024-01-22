package org.example.leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class LevelOrderTree     {

    // O(n)
    // memory O(n)
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queueLvl = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;

        queueLvl.add(root);
        while(!queueLvl.isEmpty()){
            ArrayList<Integer> level = new ArrayList<>();
            int len = queueLvl.size();
            for (int i =0; i< len;i++ ){
                TreeNode node = queueLvl.poll();
                level.add(node.val);
                if(node.left!=null){
                    queueLvl.add(node.left);
                }
                if(node.right!=null){
                    queueLvl.add(node.right);
                }
            }
            result.add(level);
        }

        return result;
    }
}