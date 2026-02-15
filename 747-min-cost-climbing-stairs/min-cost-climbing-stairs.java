class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev1 = cost[0];
        int prev2 = cost[1];
        for(int i = 2; i < n; i++){
            int curr = Math.min(prev1 , prev2) + cost[i];
            prev1 = prev2;
            prev2 = curr;
        }
        return Math.min(prev1, prev2);
    }
}