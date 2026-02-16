class Solution {
    public int countPrimeSetBits(int left, int right) {
        // Precompute primes up to 20 (since max bits of 10^6 < 20)
        boolean[] isPrime = new boolean[21];
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19};
        for (int p : primes) {
            isPrime[p] = true;
        }

        int count = 0;
        for (int num = left; num <= right; num++) {
            // count of set bits
            int bits = Integer.bitCount(num);
            if (isPrime[bits]) {
                count++;
            }
        }
        return count;
    }
}