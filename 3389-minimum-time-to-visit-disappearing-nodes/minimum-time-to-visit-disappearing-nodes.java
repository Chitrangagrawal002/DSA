class Solution {
    static class Pair{
        int node;
        int time;
        Pair(int node, int time){
            this.node = node;
            this.time = time;
        }
    }
    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            adj.get(u).add(new Pair(v, w));
            adj.get(v).add(new Pair(u, w));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.time, b.time));
        pq.add(new Pair(0,0));
        int dist[] = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int u = curr.node;
            int d = curr.time;
            if(dist[u] < d) continue;
            for(Pair nei : adj.get(u)){
                int v = nei.node;
                int t = nei.time + d;
                if(dist[v] > t && t < disappear[v]){
                    dist[v] = t;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }
        for(int i = 0; i < dist.length; i++){
            if(dist[i] == Integer.MAX_VALUE){
                dist[i] = -1;
            }
        }
        return dist;
    }
}