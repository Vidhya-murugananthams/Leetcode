class Solution:
    def isValid(self, s: str) -> bool:
        dis={')':'(','}':'{',']':'['}
        stack=[]
        for i in s:
            if i in dis:
                if len(stack)==0 or stack[-1]!=dis[i]:
                    return False
                stack.pop()
            else:
                stack.append(i)
        return len(stack)==0        