# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        l=[]
        self.rightview(root,0,l)
        return l
    def rightview(self,root,level,l):
        if root==None:
            return
        if level==len(l):
            l.append(root.val)
        self.rightview(root.right,level+1,l)
        self.rightview(root.left,level+1,l)
        