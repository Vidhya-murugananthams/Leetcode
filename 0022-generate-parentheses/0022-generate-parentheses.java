class Solution {
    public List<String> generateParenthesis(int n) {
        List<String > l=new ArrayList<String>();
         comb(n,0,0,"",l);
         return l;

    }
       
  public static void comb(int n, int open, int close,String str,List<String> l)
  {
    if(close==n)
    {
     l.add(str);
      return;
    }
    if(open<n)
    {
      comb(n,open+1,close,str+"(",l);    
      }
      if(open>close)
      {
        comb(n,open,close+1,str+")",l);
      }
  }
  public  void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

  List<String >l=generateParenthesis(n);
  System.out.print(l);
    
  }
}

