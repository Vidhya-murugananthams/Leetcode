import java.util.*;

class Solution {
    private List<List<Integer>> result;
    private int[] temp;
    private int tempSize;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        temp = new int[target]; // Max size, avoids dynamic list operations
        tempSize = 0;
        backtrack(candidates, target, 0);
        return result;
    }

    private void backtrack(int[] arr, int sum, int index) {
        if (sum == 0) {
            List<Integer> combination = new ArrayList<>(tempSize);
            for (int i = 0; i < tempSize; i++) {
                combination.add(temp[i]);
            }
            result.add(combination);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (sum - arr[i] < 0) continue; // Prune unnecessary calls

            temp[tempSize++] = arr[i]; // Use array to avoid costly List operations
            backtrack(arr, sum - arr[i], i);
            tempSize--; // Restore state (faster than removeLast)
        }
    }
}
