class Solution {
    int n, m;
    public int minFallingPathSum(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        Integer dp[][] = new Integer[n][m];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++){
            min = Math.min(min, solve(grid, 0, i, dp));
        }
        return min;
    }
    public int solve(int[][] grid, int i, int j, Integer[][] dp){
        if(i == n - 1){
            return grid[i][j];
        }
        if(dp[i][j] != null) return dp[i][j];
        int min = Integer.MAX_VALUE;
        for(int k = 0; k < m; k++){
            if(k == j) continue;
            min = Math.min(min, solve(grid, i + 1, k, dp));
        }
        return dp[i][j] = min + grid[i][j];
    }
}