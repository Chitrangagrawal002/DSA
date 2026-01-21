class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        int peak = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1] || nums[i] == nums[i+1]){
                count++;
                peak = i;
            }
        }
        if(count > 1){
            return false;
        }
        else if(count == 1){
            if(peak == 0 || peak == nums.length - 2){
                return true;
            }
            if(nums[peak + 1] > nums[peak - 1] || nums[peak] < nums[peak + 2]){
                return true;
            }
            else {
                return false;
            }
        }
        return true;
    }
}