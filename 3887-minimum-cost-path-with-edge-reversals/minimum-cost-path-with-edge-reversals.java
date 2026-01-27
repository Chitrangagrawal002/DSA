class Solution {
    public int minCost(int n, int[][] edges) {
        List<List<int[]>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj.get(u).add(new int[]{v, w});      
            adj.get(v).add(new int[]{u, 2 * w});  
        }
        long[] dist = new long[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        pq.offer(new long[]{0, 0});
        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            long d = curr[0];
            int x = (int) curr[1];
            if (visited[x]) continue;
            visited[x] = true;
            if (x == n - 1) return (int) d;
            for (int[] nei : adj.get(x)) {
                int y = nei[0];
                int z = nei[1];
                if (d + z < dist[y]) {
                    dist[y] = d + z;
                    pq.offer(new long[]{dist[y], y});
                }
            }
        }
        return -1;
    }
}
