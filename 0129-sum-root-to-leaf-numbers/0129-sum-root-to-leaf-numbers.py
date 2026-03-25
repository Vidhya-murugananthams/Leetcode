# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        return self.sum(root,0)
    def sum(self,root,pathsum):
        if root==None:
            return 0
        pathsum=pathsum*10+root.val
        if root.left==None and root.right==None:
            return pathsum
        return self.sum(root.left,pathsum)+self.sum(root.right, pathsum)
        