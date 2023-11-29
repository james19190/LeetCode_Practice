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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        if (root == null && subRoot != null) return false;
        if (root.val==subRoot.val && sameTree(root,subRoot)) {
            //if entire tree same return true
            return true;
        }
        //try to check match for left or right of subtree
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    public boolean sameTree(TreeNode p, TreeNode q){
        if (p == null & q == null) return true;
        else if (p == null & q != null || p != null & q == null) return false;
        else if (p.val != q.val) return false;
        return sameTree(p.left,q.left) && sameTree(p.right,q.right);
    }
}
