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
    int maxVal = 0;
    public int maxDepth(TreeNode root) {
        // Base condition
        if(root == null){
            return 0;
        }

        int leftHeight = maxDepth(root.left); // Height of left sub tree.
        int rightHeight = maxDepth(root.right); // Height of right sub tree.

        maxVal = Math.max(leftHeight, rightHeight)+1;

        return maxVal;

    }
}