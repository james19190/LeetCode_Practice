/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int maxDLR = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        return Math.max(maxDLR, depthOfTree(root.left) + depthOfTree(root.right));

    }

    public int depthOfTree(TreeNode root){
        if (root == null) return 0;
        return Math.max(depthOfTree(root.left) + 1, depthOfTree(root.right) + 1);
    }
}


/*
if (root == null) return 0;
        int maxDLR = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        return Math.max(maxDLR, depthOfTree(root.left) + depthOfTree(root.right));



*/
