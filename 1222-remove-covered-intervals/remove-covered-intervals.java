class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int ans = 0;
        int last = 0;
        for(int[] x : intervals){
            if(x[1] > last){
                ans++;
                last = x[1];
            }
        }
        return ans;
    }
}