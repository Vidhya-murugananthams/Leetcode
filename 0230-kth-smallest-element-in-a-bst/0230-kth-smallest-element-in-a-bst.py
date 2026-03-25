# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def kthSmallest(self, root, k):
        self.count = 0
        self.ans = None
        
        def inorder(node):
            if not node or self.count >= k:
                return
            
            inorder(node.left)   # Left
            
            self.count += 1      # Visit
            if self.count == k:
                self.ans = node.val
                return
            
            inorder(node.right)  # Right
        
        inorder(root)
        return self.ans