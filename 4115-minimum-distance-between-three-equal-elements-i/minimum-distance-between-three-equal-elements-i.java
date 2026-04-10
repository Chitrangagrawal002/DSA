class Solution {
    public int minimumDistance(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                if(nums[i] != nums[j]){
                    continue;
                }
                for(int k = j + 1; k < n; k++){
                    if(nums[j] == nums[k]){
                        ans = Math.min(ans, k - i);
                        break;
                    }
                }
            }
        }
        return ans == Integer.MAX_VALUE ? - 1: ans * 2;
    }
}