class Solution:
    def slove(self,n, opn,close,l,s):
        if close==n:
            l.append(s)
            return
        if opn<n:
            self.slove(n,opn+1,close,l,s+"(")
        if close<opn:
            self.slove(n,opn,close+1,l,s+")")

    def generateParenthesis(self, n: int) -> List[str]:
        l=[]
        self.slove(n,0,0,l,"")
        return l

        