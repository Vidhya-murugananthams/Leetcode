class Solution:
    def isValid(self, s: str) -> bool:
        stack = []

        for x in s:
            if x is '(':
                stack.append(1)
            if x is '{':
                stack.append(2)
            if x is '[':
                stack.append(3)

            if x is ')' and len(stack) > 0 and stack[-1] == 1:
                stack.pop()
            elif x is ')':
                return False
            if x is '}' and len(stack) > 0 and stack[-1] == 2:
                stack.pop()
            elif x is '}':
                return False
            if x is ']' and len(stack) > 0 and stack[-1] == 3:
                stack.pop()
            elif x is ']':
                return False
        if len(stack) == 0:
            return True
        return False
        