package org.example.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode102 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode replaceValueInTree(TreeNode root) {
        List<Integer> levelSum = new ArrayList<>();
        dfs(root, 0, levelSum);
        dfs2(root, 0, levelSum);
        return root;
    }
    private void dfs(TreeNode n, int depth, List<Integer> levelSum) {
        if (n != null) {
            if (depth == levelSum.size()) {
                levelSum.add(0);
            }
            levelSum.set(depth, levelSum.get(depth) + n.val);
            dfs(n.left, depth + 1, levelSum);
            dfs(n.right, depth + 1, levelSum);
        }
    }
    private void dfs2(TreeNode n, int depth, List<Integer> levelSum) {
        if (n != null) {
            n.val = levelSum.get(depth) - n.val;
            if (n.left != null && n.right != null) {
                int siblingsSum = n.left.val + n.right.val;
                n.left.val = n.right.val = siblingsSum;
            }
            dfs2(n.left, depth + 1, levelSum);
            dfs2(n.right, depth + 1, levelSum);
        }
    }
    public TreeNode replaceValueInTree2(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int currentLevelSum = root.val;
        while (!q.isEmpty()) {
            int nextLevelSum = 0;
            for (int sz = q.size(); sz > 0; --sz) {
                TreeNode n = q.poll();
                n.val = currentLevelSum - n.val;
                for (TreeNode kid : new TreeNode[]{n.left, n.right}) {
                    if (kid != null) {
                        q.offer(kid);
                        nextLevelSum += kid.val;
                    }
                }
                if (n.left != null && n.right != null) {
                    int sum = n.left.val + n.right.val;
                    n.left.val = n.right.val = sum;
                }
            }
            currentLevelSum = nextLevelSum;
        }
        return root;
    }
}

