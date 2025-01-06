# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        list1=[]
        self.traversal(root,list1)
        return list1
    def traversal(self,root,list1):
        if root is None:
            return
        list1.append(root.val)
        self.traversal(root.left,list1)
        self.traversal(root.right,list1)

        