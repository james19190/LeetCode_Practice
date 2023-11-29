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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = insertNode(nums, 0, nums.length - 1);
        return root;
    }

    public TreeNode insertNode(int[] num, int start, int end){

        //WHEN THERE IS NO MORE INSERT ELEMENT
        if(start > end){
            return null;
        }

        //INSERT NODE
        int mid = start + (end-start) / 2;
        TreeNode root = new TreeNode(num[mid]);
        
        //REPEAT FOR LEFT AND RIGHT SUBTREE
        root.left = insertNode(num, start, mid - 1);
        root.right = insertNodee(num, mid + 1, end);
        return root;
    }
}
