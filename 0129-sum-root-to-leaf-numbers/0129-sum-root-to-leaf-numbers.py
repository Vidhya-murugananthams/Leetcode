# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def sumNumbers(self, root):
        return self.dfs(root, 0)
    
    def dfs(self, node, pathSum):
        if node is None:
            return 0
        
        # Build the number
        pathSum = pathSum * 10 + node.val
        
        # If leaf node
        if node.left is None and node.right is None:
            return pathSum
        
        # Sum from left and right
        return self.dfs(node.left, pathSum) + self.dfs(node.right, pathSum)
