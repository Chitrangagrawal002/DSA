class Solution {
    int n, m;
    int dx[] = {0, 1, 0, -1};
    int dy[] = {1, 0, -1, 0};
    public boolean containsCycle(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!vis[i][j] && cycleDetectDFS(i, j, -1, -1, grid, vis)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean cycleDetectDFS(int i, int j, int prev_i, int prev_j, char[][] grid, boolean[][] vis){
        if(vis[i][j]){
            return true;
        }
        vis[i][j] = true;
        for(int k = 0; k < 4; k++){
            int ni = i + dx[k];
            int ny = j + dy[k];
            if(isSafe(ni, ny) && grid[i][j] == grid[ni][ny]){
                if(ni == prev_i && ny == prev_j){
                    continue;
                }
                if(cycleDetectDFS(ni, ny, i, j, grid, vis)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isSafe(int nx, int ny){
        return nx >= 0 && nx < n && ny >= 0 && ny < m;
    }
}