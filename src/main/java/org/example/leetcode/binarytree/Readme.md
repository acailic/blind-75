# Binary Tree
### Binary Order Traversal
For level order, create queue and add root to queue. While queue is not empty, poll from queue and add to list.
Then add left and right to queue.
### Validate Binary Tree
Recursively check if left is less than root and right is greater than root. Check if left and right are valid.
For corner case matching max integer, can long instead of int.
### Maximum Depth of Binary Tree
Recursively check if left and right are null. If not, add 1 to depth and recursively call left and right.
### Kth smallest element in a BST
- Inorder traversal of BST is sorted. Recursively call left, add root, then call right. Then return kth element.
-Iterative, left right. Create a stack and add root to stack. While stack is not empty, add left to stack. Then pop from stack and add to list.
Then add right to stack.
- Dfs, stack adding in dfs, and sort it return k-1
### Subtree of Another Tree
- DFS Recursively check if root is null.  If not, check if root is same as subtree. If not, check if left or right is same as subtree.

## TODO
### Longest Common Ancestor
- Recursively check if root is null. If not, check if root is p or q. If not, recursively call left and right. If left and right are not null, return root.
### Prefix Tree
### Invert Binary Tree
### Same Tree




### Notes
- Valid BST, check if left is less than root and right is greater than root. Check if left and right are valid.
- Balanced BST, check if left and right are balanced. If not, return -1. If left and right are balanced, return max of left and right + 1.
- Inorder traversal of BST is sorted. Recursively call left, add root, then call right. Then return kth element.
- Chech is subtree, recursively check if root is null.  If not, check if root is same as subtree. If not, check if left or right is same as subtree.

- Post order traversal of BST: its LEFT-RIGHT-ROOT
```
public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    if (root == null) {
        return list;
    }
    list.addAll(postorderTraversal(root.left));
    list.addAll(postorderTraversal(root.right));
    list.add(root.val);
    return list;
}
```
Result example for tree:
```
    3
   / \
  9  20
    /  \
   15   7
```
[9, 15, 7, 20, 3]
```
- Pre order traversal of BST: its ROOT-LEFT-RIGHT
```
public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    if (root == null) {
        return list;
    }
    list.add(root.val);
    list.addAll(preorderTraversal(root.left));
    list.addAll(preorderTraversal(root.right));
    return list;
}
```
Result example for tree:
```
    3
   / \
  9  20
    /  \
   15   7
```
[3, 9, 20, 15, 7]

- In order traversal of BST: its LEFT-ROOT-RIGHT
```
public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    if (root == null) {
        return list;
    }
    list.addAll(inorderTraversal(root.left));
    list.add(root.val);
    list.addAll(inorderTraversal(root.right));
    return list;
}
```