class Solution {
    public int[] transformArray(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if((nums[i] & 1) == 0){
                ans[i] = 0;
            }
            else{
                ans[i] = 1;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}