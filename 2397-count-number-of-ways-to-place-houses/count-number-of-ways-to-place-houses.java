class Solution {
    long mod = 1_000_000_007;
    public long fibo(long dp[], int n){
        if(n == 0) return 1;
        if(n == 1) return 2;
        if(dp[n] != -1) return dp[n];
        return dp[n] = (fibo(dp, n - 1) + fibo(dp, n - 2)) % mod;
    }
    public int countHousePlacements(int n) {
        long dp[] = new long[n + 1];
        Arrays.fill(dp, -1);
        long plots = fibo(dp, n);
        long ans = (plots * plots) % mod;
        return (int) ans;
    }
}