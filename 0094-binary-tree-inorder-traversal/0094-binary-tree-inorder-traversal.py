# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        result = []  # List to store traversal results
        self.traversal(result, root)  # Start in-order traversal
        return result

    def traversal(self, result: List[int], root: Optional[TreeNode]):
        if root is None:
            return  # Base case: return if the node is null
        self.traversal(result, root.left)  # Recursively visit left subtree
        result.append(root.val)           # Add current node's value to the list
        self.traversal(result, root.right)  # Recursively visit right subtree

        