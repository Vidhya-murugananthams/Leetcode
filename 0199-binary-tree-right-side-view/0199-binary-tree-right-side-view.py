class Solution:
    def rightSideView(self, root):
        result = []
        self.right(root, 0, result)
        return result

    def right(self, root, level, result):
        if root is None:
            return
        
        # If first time visiting this level
        if len(result) == level:
            result.append(root.val)
        
        # Visit right first
        self.right(root.right, level + 1, result)
        self.right(root.left, level + 1, result)
