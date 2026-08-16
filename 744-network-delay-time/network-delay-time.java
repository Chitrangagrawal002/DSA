class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }
        for(int time[] : times){
            adj.get(time[0]).add(new int[]{time[1], time[2]});
        }
        int dist[] = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{k, 0});
        while(!pq.isEmpty()){
            int node = pq.peek()[0];
            int d = pq.peek()[1];
            pq.poll();
            if(d > dist[node]){
                continue;
            }
            for(int nei[] : adj.get(node)){
                int next = nei[0];
                int weight = nei[1];
                if(dist[node] + weight < dist[next]){
                    dist[next] = dist[node] + weight;
                    pq.add(new int[]{next, dist[next]});
                }
            }
        }
        int minimum_time = 0;
        for(int i = 1; i <= n; i++){
            if(dist[i] == Integer.MAX_VALUE){
                return -1;
            }
            minimum_time = Math.max(minimum_time, dist[i]);
        }
        return minimum_time;
    }
}