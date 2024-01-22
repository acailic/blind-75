package org.example.leetcode.test;

import org.example.leetcode.binarytree.TreeNode;

public class CheckBinaryBalanced {

    // Check if a binary tree is balanced

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // balanced tree is a tree where the difference between the heights of the left and right subtrees of every node is 1 or less
        // valid tree is a tree where the left subtree is less than the root and the right subtree is greater than the root

        // generate balanced tree
        // balanced tree example :
        // 1
        // 2 2
        // 3 4 4 3
//        System.out.println (isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)))
//                ));
        // generate unbalanced tree
        // unbalanced tree example :
        // 1
        // 2 2
        // 3 4 4 3
        // 5
//        System.out.println (isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3, new TreeNode(5), null)))
//                ));
        // hat is difference beetween balanced and valid tree?
        // balanced tree is a tree where the difference between the heights of the left and right subtrees of every node is 1 or less
        // valid tree is a tree where the left subtree is less than the root and the right subtree is greater than the root
        // generate balanced tree
//        System.out.println (isValid(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3))),
//                Integer.MIN_VALUE,Integer.MIN_VALUE
//                ));
//        System.out.println (isValid(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3))),
//                Integer.MIN_VALUE,Integer.MIN_VALUE
//                ));


        /// check subtree example
        System.out.println(isSubtree(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3))),

                new TreeNode(42, new TreeNode(13), new TreeNode(4))
        ));

        /// check invalid subtree example
        System.out.println(isSubtree(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3))),
                new TreeNode(2, new TreeNode(3),
                        new TreeNode(14, new TreeNode(52), null))
        ));
    }


    public  static boolean isBalanced(TreeNode root) {
        if(root==null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return isBalanced(root.left) && isBalanced(root.right) && leftHeight ==rightHeight;
    }

    public static int height (TreeNode root) {
        if(root==null) {
            return 0;
        }
        return 1+ Math.max(height(root.left),height(root.right));
    }

    public static boolean isValid(TreeNode root, int min, int max ){
        if(root==null) {
            return true;
        }
        if(!(root.val>min &&root.val<max)) {
            return false;
        }
        return isValid(root.left,min,root.val) && isValid(root.right,root.val,max);
    }

    // check is subtree
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null || subRoot==null) return true;

        if(isIdentical(root,subRoot)){
            return true;
        }

        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
        // why || ? because we need to check both left and right subtrees
    }


    public static boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null) return true;
        if(root==null || subRoot==null) return false;

        return root.val==subRoot.val  && isIdentical(root.left, subRoot.left) && isIdentical(root.right,subRoot.right);
    }
}
