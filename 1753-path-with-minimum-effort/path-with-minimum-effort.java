class Solution {
    public int minimumEffortPath(int[][] heights) {
        int dx[] = {1, -1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        int row = heights.length;
        int col = heights[0].length;
        int max = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.add(new int[]{0, 0, 0});
        int dist[][] = new int[row][col];
        for(int[] temp : dist) Arrays.fill(temp, Integer.MAX_VALUE);
        dist[0][0] = 0;
       
        while(!pq.isEmpty()){
            int curr[] = pq.poll();
            int r = curr[0];
            int c = curr[1];
            int effort = curr[2];
            if(effort > dist[r][c]) continue;
            if(r == row-1 && c == col-1) return dist[r][c];
            for(int i = 0; i < 4; i++){
                int nr = r + dx[i];
                int nc = c + dy[i];
                if(nr >= 0 && nr < row && nc >= 0 && nc < col){
                    
                    int neweffort = Math.max(Math.abs(heights[nr][nc] - heights[r][c]), curr[2]);
                    if(neweffort < dist[nr][nc]){
                        dist[nr][nc] = neweffort;
                        pq.add(new int[]{nr, nc, neweffort});
                    } 
                }
            }
        }
        return 0;
    }
}