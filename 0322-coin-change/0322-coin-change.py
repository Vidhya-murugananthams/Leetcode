class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        INF = 10**6
        n = len(coins)
        dp = [INF for _ in range(amount + 1)]
        dp[0] = 0
        coins.sort()

        for i in range(n):
            if coins[i] > amount:
                break
            for j in range(coins[i], amount + 1):
                dp[j] = min(dp[j], dp[j - coins[i]] + 1)

        return -1 if dp[-1] == INF else dp[-1]