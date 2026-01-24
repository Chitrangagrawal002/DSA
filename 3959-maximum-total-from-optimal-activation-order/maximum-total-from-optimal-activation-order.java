class Solution {
    public long maxTotal(int[] value, int[] limit) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        int n = value.length;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(limit[i], k -> new PriorityQueue<>(Collections.reverseOrder()))
               .add(value[i]);
        }
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
            int lim = entry.getKey();
            PriorityQueue<Integer> pq = entry.getValue();

            for (int i = 0; i < lim && !pq.isEmpty(); i++) {
                ans += pq.poll();
            }
        }
        return ans;
    }
}
