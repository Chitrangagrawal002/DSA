class Solution {
    public void dfs(int current, int[] dist1, int[] edges, int dist){
        while(current != -1 && dist1[current] == -1){
            dist1[current] = dist++;
            current = edges[current];
        }
    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int res = -1;
        int n = edges.length;
        int minDist = Integer.MAX_VALUE;
        int[] dist1 = new int[n];
        int[] dist2 = new int[n];
        Arrays.fill(dist1, -1);
        Arrays.fill(dist2, -1);
        dfs(node1, dist1, edges, 0);
        dfs(node2, dist2, edges, 0);
        for(int i = 0; i < n; i++){
            if(dist1[i] >= 0 && dist2[i] >= 0){
                int distance = Math.max(dist1[i], dist2[i]);
                if(distance < minDist){
                    minDist = distance;
                    res = i;
                }
            }
        }
        return res;
    }
}