class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(st.contains(nums[i])) return nums[i];
            else st.add(nums[i]);
        }
        return -1;
    }
}