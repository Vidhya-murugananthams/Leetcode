class Solution {
    public void solve(String digits, StringBuilder output, Integer ind, List<String> mapping, List<String> ans){
        if(ind>=digits.length()){
            ans.add(output.toString());
            return;
        }
        Integer number = digits.charAt(ind)-'0';
        String value = mapping.get(number);

        for(int i=0; i<value.length(); i++){
            output.append(value.charAt(i));
            solve(digits, output, ind+1, mapping, ans);
            output.deleteCharAt(output.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length()==0)return ans;
        StringBuilder output = new StringBuilder();
        List<String> mapping = Arrays.asList("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
        solve(digits, output, 0, mapping, ans);
        return ans;
    }
}