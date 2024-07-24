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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        if(root==null)
            return l;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> cur=new ArrayList<>();
            for(int i=q.size();i>0;i--)
            {
                TreeNode t=q.poll();
                cur.add(t.val);
            
            if(t.left!=null)
                q.add(t.left);
            if(t.right!=null)
                q.add(t.right);}
            l.add(cur);
        }
        return l;
        
        }
        
    }
