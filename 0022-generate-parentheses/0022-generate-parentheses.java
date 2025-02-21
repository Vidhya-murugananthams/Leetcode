import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateCombinations(n, 0, 0, "", result);
        return result;
    }

    private void generateCombinations(int n, int openCount, int closeCount, String current, List<String> result) {
        if (closeCount == n) {
            result.add(current);
            return;
        }

        if (openCount < n) {
            generateCombinations(n, openCount + 1, closeCount, current + "(", result);
        }

        if (openCount > closeCount) {
            generateCombinations(n, openCount, closeCount + 1, current + ")", result);
        }
    }
}
