class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n];
        for(int i = 0 ; i < nums.length; i ++){
            if(freq[nums[i]] == 1) return nums[i];
            else freq[nums[i]] = 1;
        }

        return 0;
    }
}