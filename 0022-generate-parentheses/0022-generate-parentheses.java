import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateCombinations(n, 0, 0, new StringBuilder(), result);
        return result;
    }

    private void generateCombinations(int n, int openCount, int closeCount, StringBuilder current, List<String> result) {
        if (closeCount == n) {
            result.add(current.toString());
            return;
        }

        if (openCount < n) {
            current.append("(");
            generateCombinations(n, openCount + 1, closeCount, current, result);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }

        if (openCount > closeCount) {
            current.append(")");
            generateCombinations(n, openCount, closeCount + 1, current, result);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
    }
}
