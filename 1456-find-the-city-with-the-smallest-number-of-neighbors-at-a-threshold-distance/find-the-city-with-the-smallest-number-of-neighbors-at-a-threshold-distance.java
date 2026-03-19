class Solution {
    static class Pair{
        int node;
        int weight;
        Pair(int node, int weight){
            this.node = node;
            this.weight = weight;
        }
    }
    public int findTheCity(int n, int[][] edges, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(ans[i], Integer.MAX_VALUE);
            ans[i][i] = 0;
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        for(int i = 0; i < n; i++){
            bfs(n, adj, ans[i], i);
        }
        return helper(ans, n, k);
    }
    public int helper(int[][] ans, int n, int k){
        int res = -1;
        int reach = n;
        for(int i = n - 1; i >= 0; i--){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(i != j && ans[i][j] <= k){
                    count++;
                }
            }
            if(reach > count){
                reach = count;
                res = i;
            }
        }
        return res;
    }
    public void bfs(int n, List<List<Pair>> adj, int[] arr, int source){
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.weight - b.weight);
        pq.add(new Pair(source, 0));
        Arrays.fill(arr, Integer.MAX_VALUE);
        arr[source] = 0;
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int u = curr.node;
            int d = curr.weight;
            if(arr[u] > d) continue;
            for(Pair nei : adj.get(u)){
                int v = nei.node;
                int w = nei.weight;
                if(arr[v] > d + w){
                    arr[v] = d + w;
                    pq.add(new Pair(v, arr[v]));
                }
            }
        }
    }
}