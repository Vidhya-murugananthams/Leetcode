class Solution {
    private String[]phone={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
    List<String> result=new ArrayList<String>();
    if(digits.isEmpty())
    return result;
    comb(0,digits,new StringBuilder(),result);
    return result;
    }
    public void comb(int index, String digits, StringBuilder temp, List<String> result )
    {
        if(index==digits.length())
        {
            result.add(new String(temp));
            return;
        }
        String cur=phone[digits.charAt(index)-'0'];
        for ( char c:cur.toCharArray())
        {
            temp.append(c);
            comb(index+1,digits,temp,result);
            temp.deleteCharAt(temp.length()-1);
        }
    }

        
    }
