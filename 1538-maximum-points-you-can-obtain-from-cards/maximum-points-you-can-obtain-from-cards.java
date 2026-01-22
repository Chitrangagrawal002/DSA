class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int total = 0;
        for(int num : nums){
            total += num;
        }
        if(k == n){
            return total;
        }
        int size = n - k;
        int sizeSum = 0;
        for(int i = 0; i < size; i++){
            sizeSum += nums[i];
        }
        int minsizeSum = sizeSum;
        for(int i = size; i < n; i++){
            sizeSum = sizeSum + nums[i] - nums[i - size];
            minsizeSum = Math.min(minsizeSum , sizeSum);
        }
        return total - minsizeSum;
    }
}