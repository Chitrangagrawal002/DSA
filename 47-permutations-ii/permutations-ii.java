class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        helper(nums, new ArrayList<Integer>(), 0);
        return res;
    }
    public void helper(int[] nums, List<Integer> curr, int idx){
        if(idx == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = idx; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                swap(nums, i, idx);
                curr.add(nums[idx]);
                helper(nums, curr, idx + 1);
                curr.remove(curr.size() - 1);
                swap(nums, i, idx);
            }
        }
    }
}