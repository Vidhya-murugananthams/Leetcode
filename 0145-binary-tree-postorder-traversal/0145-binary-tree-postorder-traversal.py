# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        li=[]
        self.traversal(root,li)
        return li
    def traversal(self,root,li):
        if root is None:
            return
        self.traversal(root.left,li)
        self.traversal(root.right,li)
        li.append(root.val)
        