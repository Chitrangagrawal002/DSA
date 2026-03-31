class Solution {
    int n, m;
    Integer dp[][];
    int[][] dr = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int longestIncreasingPath(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int ans = 0;
        dp = new Integer[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ans = Math.max(ans, dfs(grid, i, j));
            }
        }
        return ans;
    }
    public int dfs(int[][] grid, int i, int j){
        if(dp[i][j] != null) return dp[i][j];
        int ans = 1;
        for(int x = 0; x < 4; x++){
            int nx = i + dr[x][0];
            int ny = j + dr[x][1];
            if(isSafe(nx, ny) && grid[nx][ny] > grid[i][j]){
                ans = Math.max(ans, 1 + dfs(grid, nx, ny));
            }
        }
        return dp[i][j] = ans;
    }
    public boolean isSafe(int r, int c){
        return r >= 0 && r < n && c >= 0 && c < m;
    }
}