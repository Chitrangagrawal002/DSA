class Solution {
    int n, m;
    public int numIslands(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int ans = 0;
        boolean vis[][] = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!vis[i][j] && grid[i][j] == '1'){
                    dfs(grid, vis, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }
    public void dfs(char[][] grid, boolean[][] vis, int i, int j){
        if(i < 0 || j < 0 || i >= n || j >= m){
            return;
        }
        if(grid[i][j] == '0' || vis[i][j]){
            return;
        }
        vis[i][j] = true;
        dfs(grid, vis, i + 1, j);
        dfs(grid, vis, i, j + 1);
        dfs(grid, vis, i - 1, j);
        dfs(grid, vis, i, j - 1);
    }
}