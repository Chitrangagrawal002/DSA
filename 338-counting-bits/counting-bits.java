class Solution {
    public int[] countBits(int n) {
        if(n == 0) return new int[]{0};
        if(n == 1) return new int[]{0, 1};
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = Integer.bitCount(i);
        }
        return dp;
    }
}