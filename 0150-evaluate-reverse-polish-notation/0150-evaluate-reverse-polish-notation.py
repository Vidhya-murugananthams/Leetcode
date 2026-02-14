class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack: List(int) = []
        for token in tokens:
            if token == '+':
                stack.append(stack.pop() + stack.pop())
            elif token == '-':
                operand1 = stack.pop()
                operand2 = stack.pop()
                stack.append(operand2 - operand1)
            elif token == '*':
                stack.append(stack.pop() * stack.pop())
            elif token == '/':
                operand1 = stack.pop()
                operand2 = stack.pop()
                stack.append(int(operand2 / operand1))
            else:
                stack.append(int(token))
        return stack[-1]