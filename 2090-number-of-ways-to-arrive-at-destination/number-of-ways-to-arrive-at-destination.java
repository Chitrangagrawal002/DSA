class Solution {
    static class Pair{
        int node;
        long weight;
        Pair(int node, long weight){
            this.node = node;
            this.weight = weight;
        }
    }
    public int countPaths(int n, int[][] roads) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < roads.length; i++){
            int u = roads[i][0];
            int v = roads[i][1];
            int w = roads[i][2];
            adj.get(u).add(new Pair(v , w));
            adj.get(v).add(new Pair(u, w));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Long.compare(a.weight, b.weight));
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        long[] ways = new long[n];
        int mod = (int)(1e9 + 7);
        dist[0] = 0;
        ways[0] = 1;
        pq.add(new Pair(0, 0));
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int u = curr.node;
            long d = curr.weight;
            if(d > dist[u]) continue;
            for(Pair nei : adj.get(u)){
                int v = nei.node;
                long newDist = d + nei.weight;
                if(newDist < dist[v]){
                    dist[v] = newDist;
                    ways[v] = ways[u];
                    pq.add(new Pair(v, newDist));
                }
                else if(newDist == dist[v]){
                    ways[v] = (ways[v] + ways[u]) % mod;
                }
            }
        }
        return (int)(ways[n - 1] % mod);
    }
}