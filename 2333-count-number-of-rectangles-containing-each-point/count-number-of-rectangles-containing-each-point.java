class Solution {
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        List<Integer>[] list = new ArrayList[101];
        for(int i = 1; i < 101; i++){
            list[i] = new ArrayList<>();
        }
        for(int r[] : rectangles){
            list[r[1]].add(r[0]);
        }
        for(int i = 1; i <= 100; i++){
            Collections.sort(list[i]);
        }
        int res[] = new int[points.length];
        for(int i = 0; i < points.length; i++){
            int x = points[i][0];
            int y = points[i][1];
            int count = 0;
            for(int j = y; j <= 100; j++){
                if(list[j].isEmpty()) continue;
                int idx = lowerbound(list[j], x);
                count += list[j].size() - idx;
            }
            res[i] = count;
        }
        return res;
    }
    public int lowerbound(List<Integer> curr, int target) {
        int lo = 0, hi = curr.size();
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (curr.get(mid) < target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}