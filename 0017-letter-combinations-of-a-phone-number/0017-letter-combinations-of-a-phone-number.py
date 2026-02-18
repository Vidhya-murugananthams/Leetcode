class Solution:
    def find(self, digit,output,index,keybad,res):
        if index>=len(digit):
            res.append(output)
            return
        number=int(digit[index])
        key=keybad[number]
        for ch in key:
            self.find(digit,output+ch,index+1,keybad,res)
    def letterCombinations(self, digits: str) -> List[str]:
        res=[]
        keybad=["","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"]
        self.find(digits,"",0,keybad,res)
        return res
        