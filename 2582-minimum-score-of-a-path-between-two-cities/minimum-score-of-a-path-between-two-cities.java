class Solution {
    static class Pair{
        int v;
        int w;
        Pair(int v, int w){
            this.v = v;
            this.w = w;
        }
    }
    public int minScore(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] road : roads){
            int u = road[0];
            int v = road[1];
            int w = road[2];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        boolean vis[] = new boolean[n + 1];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        vis[1] = true;
        int min = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(Pair p : adj.get(curr)){
                min = Math.min(min, p.w);
                if(!vis[p.v]){
                    vis[p.v] = true;
                    q.add(p.v);
                }
            }
        }
        return min;
    }
}