package org.example.leetcode.test;

import org.example.leetcode.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LevelOrder {
    // 0.5, pogresio stack umesto queue i nivoe
    public List<List<Integer>> levelOrder(TreeNode root) {
        // Your code here
        List<List<Integer>> result = new ArrayList<>();
        Stack<TreeNode>  stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            int levelSize = stack.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i=0; i<levelSize; i++) {
                TreeNode curr = stack.pop();
                level.add(curr.val);
                if (curr.left != null) {
                    stack.push(curr.left);
                }
                if (curr.right != null) {
                    stack.push(curr.right);
                }
            }

            result.add(level);
        }

        return result;
    }

    /*
    So need queue to put elements and process them. Queue implementation as linked list.
    Diff between stack and queue is that stack is LIFO and queue is FIFO.
    For queue, diff in add and offer is that add throws exception if queue is full and offer returns false.
    Another diff beetween add and offer is that add is from collection interface and offer is from queue interface.
    For each level create a list.
    sife of queue is size of levels

    */

}
