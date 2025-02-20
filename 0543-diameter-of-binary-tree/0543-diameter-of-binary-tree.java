class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    private int diameter = 0; 
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return diameter; }

    private int helper(TreeNode node) {
        if (node == null) return 0; 
        int leftDepth = helper(node.left);  
        int rightDepth = helper(node.right); 
        int currentDiameter = leftDepth + rightDepth;
        diameter = Math.max(diameter, currentDiameter);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}