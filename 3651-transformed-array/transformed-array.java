class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                int idx = (i + nums[i]) % n;
                idx = (idx + n) % n;
                res[i] = nums[idx];
            }
            else{
                res[i] = nums[(i + nums[i]) % n];
            }
        }
        return res;
    }
}