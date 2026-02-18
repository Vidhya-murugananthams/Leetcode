import java.util.*;

class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();

        if (digits == null || digits.length() == 0)
            return list;

        String[] s = {
                "", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        combination(0, digits, "", list, s);

        return list;
    }

    public static void combination(int i, String digits, String current,
                                   List<String> list, String[] s) {

        if (i == digits.length()) {
            list.add(current);
            return;
        }

        String t = s[digits.charAt(i) - '0'];

        for (char c : t.toCharArray()) {
            combination(i + 1, digits, current + c, list, s);
        }
    }
}
