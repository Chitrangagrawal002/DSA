class Solution {
    Integer dp[][][];
    int n;
    public int cherryPickup(int[][] grid) {
        n = grid.length;
        dp = new Integer[n][n][n];
        return Math.max(0, helper(grid, 0, 0, 0));
    }

    public int helper(int[][] grid, int i1, int j1, int j2) {
        int i2 = i1 + j1 - j2;
        if (i1 >= n || j1 >= n || i2 >= n || j2 >= n || grid[i1][j1] == -1 || grid[i2][j2] == -1) {
            return Integer.MIN_VALUE;
        }
        if(dp[i1][j1][j2] != null) return dp[i1][j1][j2];
        if (i1 == n - 1 && j1 == n - 1) {
            return grid[i1][j1];
        }
        int cherry = grid[i1][j1];
        if (i1 != i2) {
            cherry += grid[i2][j2];
        }
        int best = Math.max(
                Math.max(helper(grid, i1 + 1, j1, j2),
                        helper(grid, i1 + 1, j1, j2 + 1)),
                Math.max(helper(grid, i1, j1 + 1, j2),
                        helper(grid, i1, j1 + 1, j2 + 1)));
        return dp[i1][j1][j2] = cherry + best;
    }
}