class Job{
    int startTime;
    int endTime;
    int profit;
    public Job(int startTime, int endTime, int profit){
        this.startTime = startTime;
        this.endTime = endTime;
        this.profit = profit;
    }
}
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        Job[] job = new Job[n];
        for(int i = 0; i < n; i++){
            job[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        Arrays.sort(job, Comparator.comparingInt(a -> a.endTime));
        int dp[] = new int[n + 1];
        for(int i = 0; i < n; i++){
            int currstart = job[i].startTime;
            int currend = job[i].endTime;
            int currprofit = job[i].profit;
            int lastjob = search(job, i, currstart);
            dp[i + 1] = Math.max(dp[i] , dp[lastjob] + currprofit);
        }
        return dp[n];
    }
    public int search(Job[] job, int end, int target){
        int lo = 0;
        int hi = end;
        while(lo < hi){
            int mid = lo + (hi - lo)/2;
            if(job[mid].endTime <= target){
                lo = mid + 1;
            }
            else{
                hi = mid;
            }
        }
        return lo;
    }
}