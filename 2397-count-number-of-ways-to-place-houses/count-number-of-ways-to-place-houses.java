class Solution {
    public int countHousePlacements(int n) {
        if(n == 1) return 4;
        long mod = 1_000_000_007;
        long a = 1;
        long b = 2;
        long k = 0;
        for(int i = 2; i <= n; i++){
            k = (a + b) % mod;
            a = b;
            b = k;
        }
        long ans = (k * k) % mod;
        return (int) ans;
    }
}