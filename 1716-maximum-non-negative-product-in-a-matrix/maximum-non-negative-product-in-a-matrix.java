class Solution {
    class Pair {
        long max, min;
        Pair(long max, long min) {
            this.max = max;
            this.min = min;
        }
    }
    Pair[][] dp;
    public Pair helper(int[][] grid, int i, int j) {
        int n = grid.length, m = grid[0].length;
        if (i >= n || j >= m) return null;
        if (i == n - 1 && j == m - 1) {
            return new Pair(grid[i][j], grid[i][j]);
        }
        if (dp[i][j] != null) return dp[i][j];
        Pair right = helper(grid, i, j + 1);
        Pair down = helper(grid, i + 1, j);
        long val = grid[i][j];
        long maxVal = Long.MIN_VALUE;
        long minVal = Long.MAX_VALUE;
        if (right != null) {
            long a = val * right.max;
            long b = val * right.min;
            maxVal = Math.max(maxVal, Math.max(a, b));
            minVal = Math.min(minVal, Math.min(a, b));
        }
        if (down != null) {
            long a = val * down.max;
            long b = val * down.min;
            maxVal = Math.max(maxVal, Math.max(a, b));
            minVal = Math.min(minVal, Math.min(a, b));
        }
        return dp[i][j] = new Pair(maxVal, minVal);
    }
    public int maxProductPath(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        dp = new Pair[n][m];
        Pair res = helper(grid, 0, 0);
        if (res.max < 0) return -1;
        return (int)(res.max % 1_000_000_007);
    }
}