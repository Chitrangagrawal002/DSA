class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n <= 1) return true;
        int reach = 0;
        for(int i = 0; i < n; i++){
            if(i > reach) return false;
            reach = Math.max(reach , i + nums[i]);
            if(reach >= n-1) return true;
        }
        return false;
    }
}