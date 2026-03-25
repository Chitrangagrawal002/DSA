class Solution {
    public int twoEggDrop(int n) {
        Integer dp[][] = new Integer[3][n + 1];
        return helper(dp, 2, n);
    }
    public int helper(Integer[][] dp, int k, int n){
        if(n == 0 || n == 1 || k == 1){
            return n;
        }
        if(dp[k][n] != null) return dp[k][n];
        int res = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++){
            int breaked = helper(dp, k - 1, i - 1);
            int notbreak = helper(dp, k, n - i);
            res = Math.min(res, Math.max(breaked, notbreak) + 1);
        }
        return dp[k][n] = res;
    }
}