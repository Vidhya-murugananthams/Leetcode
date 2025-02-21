import java.util.*;

class Solution {
    private List<List<Integer>> result;
    private ArrayList<Integer> temp;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        temp = new ArrayList<>();
        backtrack(candidates, target, 0);
        return result;
    }

    private void backtrack(int[] candidates, int target, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(temp)); // Add a copy of temp
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] > target) continue; // Prune unnecessary calls

            temp.add(candidates[i]); // Use ArrayList instead of int[]
            backtrack(candidates, target - candidates[i], i);
            temp.remove(temp.size() - 1); // Restore state (backtrack)
        }
    }
}
