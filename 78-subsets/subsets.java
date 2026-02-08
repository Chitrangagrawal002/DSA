class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(nums, 0, new ArrayList<Integer>());
        return ans;
    }
    public void helper(int[] nums, int idx, ArrayList<Integer> curr){
        if(idx == nums.length){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        curr.add(nums[idx]);
        helper(nums, idx + 1, curr);
        curr.remove(curr.size() - 1);
        helper(nums, idx + 1, curr);
    }
}