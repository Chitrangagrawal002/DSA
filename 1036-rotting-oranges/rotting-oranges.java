class Solution {
    int n, m;
    public int orangesRotting(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2){
                    vis[i][j] = true;
                    q.add(new int[]{i, j, 0});
                }
            }
        }
        int ans = 0;
        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};
        while(!q.isEmpty()){
            int r = q.peek()[0];
            int c = q.peek()[1];
            int t = q.peek()[2];
            q.poll();
            ans = Math.max(ans, t);
            for(int i = 0; i < 4; i++){
                int nr = r + drow[i];
                int nc = c + dcol[i];
                if(nr >= 0 && nc >= 0 && nr < n && nc < m && !vis[nr][nc] && grid[nr][nc] == 1){
                    q.add(new int[]{nr, nc, t + 1});
                    vis[nr][nc] = true;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    return -1;
                }
            }
        }
        return ans;
    }
}