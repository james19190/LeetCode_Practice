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
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        boolean rootBalance = Math.abs(depth(root.left) - depth(root.right)) <= 1;
        boolean childBalance = isBalanced(root.left) && isBalanced(root.right);
        return rootBalance && childBalance;
    }

    public int depth(TreeNode root){
        if(root == null) {
            return 0;
        }
        else {
            int bf = Math.max(depth(root.left), depth(root.right)) + 1;
            return bf;
        }
    }
}