import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        boolean reverse = true;
        
        while (!q.isEmpty()) {
            Deque<TreeNode> newQ = new ArrayDeque<>();
            List<Integer> level = new ArrayList<>();
            
            for (TreeNode node : q) {
                level.add(node.val);
                if (reverse) {
                    if (node.left != null) newQ.addFirst(node.left);
                    if (node.right != null) newQ.addFirst(node.right);
                } else {
                    if (node.right != null) newQ.addFirst(node.right);
                    if (node.left != null) newQ.addFirst(node.left);
                }
            }
            
            res.add(level);
            q = newQ;
            reverse = !reverse;
        }
        
        return res;
    }
}
