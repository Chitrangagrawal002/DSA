class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int lo = 1;
        int hi = (int) 1e7;
        int ans = -1;
        int n = dist.length;
        while(lo <= hi){
            int speed = lo + (hi - lo) / 2;
            double time = 0;
            for(int i = 0; i < n - 1; i++){
                time += Math.ceil((double) dist[i] / speed);
            }
            time += (double)dist[n-1] / speed;
            if(time > hour){
                lo = speed + 1;
            }
            else{
                ans = speed;
                hi = speed - 1;
            }
        }
        return ans;
    }
}