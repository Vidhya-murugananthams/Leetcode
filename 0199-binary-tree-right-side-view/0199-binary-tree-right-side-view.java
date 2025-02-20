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
    static Queue<Integer>q=new LinkedList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<Integer>();
         traversal(root,0);
        while(!q.isEmpty())
            l.add(q.poll());
        return l;
    }
    public void traversal(TreeNode root, int level)
    {
        if (root==null)
            return ;
        if (level==q.size())
            q.add(root.val);
        traversal(root.right,level+1);
        traversal(root.left,level+1);
    }
}