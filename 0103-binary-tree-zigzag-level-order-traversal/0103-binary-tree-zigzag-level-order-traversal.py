class Solution:
    def zigzagLevelOrder(self, root):
        result = []
        if not root:
            return result
        
        flag = True
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
            
            
            result.append(level)
            flag = not flag
            if flag:
                level.reverse()
        
        return result
