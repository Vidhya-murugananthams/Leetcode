import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        char[] current = new char[n * 2]; // Preallocate char array to avoid new string creation
        generateCombinations(n, 0, 0, current, 0, result);
        return result;
    }

    private void generateCombinations(int n, int openCount, int closeCount, char[] current, int pos, List<String> result) {
        if (closeCount == n) {
            result.add(new String(current)); // Convert char array to String only when needed
            return;
        }

        if (openCount < n) {
            current[pos] = '(';
            generateCombinations(n, openCount + 1, closeCount, current, pos + 1, result);
        }

        if (openCount > closeCount) {
            current[pos] = ')';
            generateCombinations(n, openCount, closeCount + 1, current, pos + 1, result);
        }
    }
}
