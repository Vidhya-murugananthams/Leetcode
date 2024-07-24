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
    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> l=new ArrayList<Integer> ();
        
        traversal(l,root);
        return l;
        
    }
    
    public void traversal(List<Integer> l , TreeNode root)
    {
        if(root==null)
            
            return;
        
        traversal(l, root.left);
        l.add(root.val);
        traversal(l,root.right);
    }
    
}