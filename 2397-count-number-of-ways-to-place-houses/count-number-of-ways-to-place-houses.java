class Solution {
    public int countHousePlacements(int n) {
        long mod = 1_000_000_007;
        long a = 1;
        long b = 2;
        for (int i = 2; i <= n; i++) {
            long k = (a + b) % mod;
            a = b;
            b = k;
        }
        long ans = (b * b) % mod;
        return (int) ans;
    }
}
