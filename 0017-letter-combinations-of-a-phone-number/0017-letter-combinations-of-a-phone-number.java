class Solution {
    static String keypad[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
       
        List<String> l = new ArrayList<String>();
     if(digits.length()==0)
     return l;
        possible(digits, 0, "", l);
        return l;

    }

    public void possible(String s, int j, String ans, List<String> l) {
        if (j == s.length()) {
            l.add(ans);
            return;
        }
        String key = keypad[s.charAt(j) - 48];
        for (int i = 0; i < key.length(); i++) {
            possible(s, j + 1, ans + key.charAt(i), l);
        }
    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() == 0 || s.equals(""))
            System.out.print("[]");
        else {
            List<String> l = letterCombinations(s);
            System.out.print(l);
        }

    }
}
