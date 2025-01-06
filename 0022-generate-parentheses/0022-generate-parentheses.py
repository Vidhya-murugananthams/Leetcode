class Solution:
    def generateParenthesis(self, n: int) -> List[str]:      
        def _generate_combinations( n, open_count, close_count, current_str, result):
            if close_count == n:
                result.append(current_str)
                return
            if open_count < n:
                _generate_combinations(n, open_count + 1, close_count, current_str + "(", result)
            if open_count > close_count:
                _generate_combinations(n, open_count, close_count + 1, current_str + ")", result)
        result = []  
        _generate_combinations(n, 0, 0, "", result) 
        return result