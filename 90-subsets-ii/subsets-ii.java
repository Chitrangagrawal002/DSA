class Solution {
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(nums, 0, new ArrayList<Integer>());
        return new ArrayList<>(set);
    }
    public void helper(int[] nums, int idx, ArrayList<Integer> curr){
        if(idx == nums.length){
            set.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        helper(nums, idx + 1, curr);
        
        curr.remove(curr.size() - 1);
        helper(nums, idx + 1, curr);
    }
}