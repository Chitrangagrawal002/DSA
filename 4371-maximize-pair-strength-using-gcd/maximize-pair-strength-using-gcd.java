class Solution {
    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long ans = Long.MIN_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                long prod = (long)nums[i] * (long)nums[j];
                long gcd = (long)Math.pow((long)GCD(nums[i], nums[j]), 2);
                ans = Math.max(ans, prod/gcd);
            }
        }
        return ans;
    }
    public int GCD(int a, int b){
        if(b == 0){
            return a;
        }
        return GCD(b, a % b);
    }
}