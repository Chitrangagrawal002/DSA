class Solution {
    int n, m;
    Integer dp[][];
    int mod = 1_000_000_007;
    int dr[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int countPaths(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        dp = new Integer[n][m];
        int res = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                res = (res + dfs(grid, i, j)) % mod;
            }
        }
        return res;
    }
    public int dfs(int[][] grid, int i, int j){
        if(dp[i][j] != null) return dp[i][j];
        int ans = 1;
        for(int x = 0; x < 4; x++){
            int nx = i + dr[x][0];
            int ny = j + dr[x][1];
            if(isSafe(nx, ny) && grid[nx][ny] > grid[i][j]){
                ans = (ans + dfs(grid, nx, ny)) % mod;
            }
        }
        return dp[i][j] = ans;
    }
    public boolean isSafe(int x, int y){
        return x >= 0 && x < n && y >= 0 && y < m;
    }
}