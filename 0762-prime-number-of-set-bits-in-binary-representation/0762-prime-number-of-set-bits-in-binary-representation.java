class Solution {
    public int countPrimeSetBits(int left, int right) {

        boolean[] isPrime = new boolean[21];
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19};

        for (int p : primes) {
            isPrime[p] = true;
        }

        int count = 0;

        for (int num = left; num <= right; num++) {

            int temp = num;   // IMPORTANT: use temp variable
            int bits = 0;

            while (temp > 0) {
                if ((temp & 1) == 1) {   // FIXED condition
                    bits++;
                }
                temp >>= 1;
            }

            if (bits < isPrime.length && isPrime[bits]) {
                count++;
            }
        }
        return count;
    }
}
