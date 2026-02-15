class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int i = 0;
        int j = 0;
        while(j < n - 1){
            int reach = 0;
            for(int k = i; k <= j; k++){
                reach = Math.max(reach, k + nums[k]);
            }
            i = j + 1;
            j = reach;
            ans++;
        }
        return ans;
    }
}