# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        result = [] 
        self.traversal(result, root)  
        return result

    def traversal(self, result: List[int], root: Optional[TreeNode]):
        if root is None:
            return  
        self.traversal(result, root.left) 
        result.append(root.val)          
        self.traversal(result, root.right)  