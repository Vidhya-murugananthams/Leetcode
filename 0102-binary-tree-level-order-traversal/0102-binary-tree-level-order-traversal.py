# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root is None:
            return []
        l=[]
        queue=deque()
        queue.append(root)
        while queue:
            
            li=[]
            for i in range(len(queue)):
                cur=queue.popleft()
                li.append(cur.val)
                if cur.left is not None:
                    queue.append(cur.left)
                if cur.right is not None:
                    queue.append(cur.right)
            l.append(li)
        return l