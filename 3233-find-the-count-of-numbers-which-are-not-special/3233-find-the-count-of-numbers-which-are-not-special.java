class Solution {
    public int nonSpecialCount(int l, int r) {
        int total = r - l + 1;
        int special = 0;

        int start = (int)Math.sqrt(l);
        int end = (int)Math.sqrt(r);

        for(int i = start; i <= end; i++) {
            if(isPrime(i)) {
                int square = i * i;
                if(square >= l && square <= r)
                    special++;
            }
        }

        return total - special;
    }

    private boolean isPrime(int n) {
        if(n < 2) return false;

        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
