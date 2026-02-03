class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 1;
        while(i < n && nums[i] > nums[i - 1]){
            i++;
        }
        int p = i - 1;
        while(i < n && nums[i - 1] > nums[i]){
            i++;
        }
        int q = i - 1;
        while(i < n && nums[i] > nums[i - 1]){
            i++;
        }
        int r = i - 1;
        return (p != 0) && (q != p) && (r == n - 1) && (r != q);
    }
}