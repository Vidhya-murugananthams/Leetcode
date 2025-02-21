import java.util.*;

class Solution {
    private List<List<Integer>> result;
    private int[] temp;
    private int tempSize;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        temp = new int[target];  // Max possible size, avoids dynamic resizing
        tempSize = 0;
        backtrack(candidates, target, 0);
        return result;
    }

    private void backtrack(int[] candidates, int target, int index) {
        if (target == 0) {
            List<Integer> combination = new ArrayList<>(tempSize);
            for (int i = 0; i < tempSize; i++) {
                combination.add(temp[i]);
            }
            result.add(combination);
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] > target) continue; // Prune early

            temp[tempSize++] = candidates[i]; // Use array to avoid costly List operations
            backtrack(candidates, target - candidates[i], i);
            tempSize--; // Restore state (faster than removeLast)
        }
    }
}
