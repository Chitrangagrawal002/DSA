class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long lo = 1;
        long hi = (long) 1e18;
        long ans = hi;
        while(lo <= hi){
            long mid = lo + (hi - lo) / 2;
            long total = 0;
            for(int time : workerTimes){
                long val = (2 * mid) / time;
                total += (long)((Math.sqrt(1 + 4 * val) - 1) / 2);
                if(total >= mountainHeight) {
                    break;
                }
            }
            if(total >= mountainHeight){
                ans = mid;
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return ans;
    }
}