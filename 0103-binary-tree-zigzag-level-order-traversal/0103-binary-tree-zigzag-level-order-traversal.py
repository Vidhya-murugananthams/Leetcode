class Solution:
    def zigzagLevelOrder(self, root):
        result = []
        if not root:
            return result
        
        flag = False
        q = deque([root])
        
        while q:
            size = len(q)
            level = []
            
            for _ in range(size):
                cur = q.popleft()
                level.append(cur.val)
                
                if cur.left:
                    q.append(cur.left)
                if cur.right:
                    q.append(cur.right)
            
            if flag:
                level.reverse()
            
            result.append(level)
            flag = not flag
        
        return result
