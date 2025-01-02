class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        # Mapping of closing brackets to their corresponding opening brackets
        bracket_map = {')': '(', '}': '{', ']': '['}

        for char in s:
            if char in bracket_map:  # If it's a closing bracket
                # Check if the stack is empty or the top of the stack doesn't match
                if not stack or stack[-1] != bracket_map[char]:
                    return False
                stack.pop()  # Remove the matching opening bracket
            else:  # If it's an opening bracket
                stack.append(char)

        # If the stack is empty, all brackets are balanced
        return len(stack) == 0
