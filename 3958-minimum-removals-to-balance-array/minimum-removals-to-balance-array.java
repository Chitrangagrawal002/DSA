class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        int j = 0;
        for(int i = 0; i < n; i++){
            while(j < n && (long)nums[j] <= (long)nums[i] * k){
                j++;
            }
            ans = Math.max(ans, j-i);
        }
        return n - ans;
    }
}