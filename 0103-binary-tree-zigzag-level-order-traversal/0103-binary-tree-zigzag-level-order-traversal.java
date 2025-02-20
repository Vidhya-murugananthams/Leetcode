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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
        if(root==null){
            return res;
        }
        que.add(root);
        boolean x=true;
        while(!que.isEmpty()){
            int s=que.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode cur=que.poll();
                if(x){
                    temp.add(cur.val);
                }else{
                    temp.add(0,cur.val);
                }
                if(cur.left!=null){
                    que.add(cur.left);
                }
                if(cur.right!=null){
                    que.add(cur.right);
                }  

            }
            res.add(temp);
            x=!x;

        }
        return res;
    }
}