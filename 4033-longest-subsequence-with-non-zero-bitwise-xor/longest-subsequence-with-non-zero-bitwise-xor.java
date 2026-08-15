class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = 0;
        boolean allzero = true;
        for(int num : nums){
            xor ^= num;
            if(num != 0){
                allzero = false;
            }
        }
        if(allzero) return 0;
        return xor == 0 ? n - 1 : n;
    }
}