import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sorting helps in pruning (optional for LeetCode)
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int index, List<Integer> temp, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] > target) break; // Prune unnecessary calls

            temp.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, temp, result);
            temp.remove(temp.size() - 1); // Backtrack
        }
    }
}
