class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length -1;
        int max = 0;
        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum > max) max = sum;
            left++;
            right--;
        }
        return max;
    }
}