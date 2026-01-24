class Solution {
    public long maxTotal(int[] value, int[] limit) {
        int n = value.length;
        List<Integer>[] groups = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) groups[i] = new ArrayList<>();
        for (int i = 0; i < n; i++) groups[limit[i]].add(value[i]);
        long total = 0;
        for (int k = 1; k <= n; k++) {
            List<Integer> list = groups[k];
            if (list.isEmpty()) continue;
            Collections.sort(list, Collections.reverseOrder());
            int count = Math.min(k, list.size());
            for (int i = 0; i < count; i++) total += list.get(i);
        }
        return total;
    }
}