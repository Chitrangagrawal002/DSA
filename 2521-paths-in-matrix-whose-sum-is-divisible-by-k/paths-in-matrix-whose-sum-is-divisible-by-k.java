class Solution {
    int mod = 1_000_000_007;
    public int numberOfPaths(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        Integer dp[][][] = new Integer[n][m][k];
        return helper(grid, k, 0, 0, 0, dp);
    }
    public int helper(int[][] grid, int k, int sum, int i, int j, Integer[][][] dp){
        if(i >= grid.length || j >= grid[0].length) return 0;
        if(i == grid.length - 1 && j == grid[0].length - 1){
            sum = (sum + grid[i][j]) % mod;
            if(sum % k == 0){
                return 1;
            }
            return 0;
        }
        if(dp[i][j][sum % k] != null) return dp[i][j][sum % k];
        int right = helper(grid, k, (sum + grid[i][j]) % mod, i, j + 1, dp) % mod;
        int down = helper(grid, k, (sum + grid[i][j]) % mod, i + 1, j, dp) % mod;
        return dp[i][j][sum % k] = (right + down) % mod;
    }
}