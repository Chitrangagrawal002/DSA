class Solution {
    static class Pair{
        int x;
        int y;
        int cost;
        Pair(int x, int y, int cost){
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
    boolean isValid(int nx, int ny, int n, int m){
        return nx >= 0 && ny >= 0 && nx < n && ny < m;
    }
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.cost - b.cost);
        pq.add(new Pair(0, 0, 0));
        boolean vis[][] = new boolean[n][m];
        vis[0][0] = true;
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            if(temp.x == n - 1 && temp.y == m - 1) return temp.cost;
            for(int i = 0; i < 4; i++){
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                if(isValid(nx, ny, n, m) && (!vis[nx][ny])){
                    vis[nx][ny] = true;
                    pq.add(new Pair(nx, ny, Math.max(0, moveTime[nx][ny] - temp.cost) + 1 + temp.cost));
                }
            }
        }
        return -1;
    }
}