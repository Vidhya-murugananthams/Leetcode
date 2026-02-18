class Solution:
    
    def solve(self, digits, output, ind, mapping, ans):
        if ind >= len(digits):
            ans.append(output)
            return
        
        number = int(digits[ind])
        value = mapping[number]
        
        for ch in value:
            self.solve(digits, output + ch, ind + 1, mapping, ans)
    
    def letterCombinations(self, digits: str):
        ans = []
        
        if len(digits) == 0:
            return ans
        
        mapping = ["", "", "abc", "def", "ghi",
                   "jkl", "mno", "pqrs", "tuv", "wxyz"]
        
        self.solve(digits, "", 0, mapping, ans)
        
        return ans
