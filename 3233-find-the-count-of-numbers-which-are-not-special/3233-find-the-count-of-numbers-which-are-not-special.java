class Solution {
    public int nonSpecialCount(int l, int r) {
        int total = r - l + 1;

        int start = (int) Math.ceil(Math.sqrt(l));
        int end = (int) Math.floor(Math.sqrt(r));

      

        boolean[] isPrime = sieve(end);

        int special = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime[i]) special++;
        }

        return total - special;
    }

    private boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        if (n >= 2) {
            for (int i = 2; i <= n; i++) prime[i] = true;
            for (int i = 2; i * i <= n; i++) {
                if (prime[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        prime[j] = false;
                    }
                }
            }
        }
        return prime;
    }
}