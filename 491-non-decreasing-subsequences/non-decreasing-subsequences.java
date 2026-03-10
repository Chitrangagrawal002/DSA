class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        helper(nums, new ArrayList<Integer>(), 0);
        return res;
    }
    public void helper(int[] nums, List<Integer> curr, int start){
        if(curr.size() >= 2){
            res.add(new ArrayList<>(curr));
        }
        Set<Integer> used = new HashSet<>();
        for(int i = start; i < nums.length; i++){
            if(used.contains(nums[i])) continue;
            if(curr.size() == 0 || nums[i] >= curr.get(curr.size() - 1)){
                used.add(nums[i]);
                curr.add(nums[i]);
                helper(nums, curr, i + 1);
                curr.remove(curr.size() - 1);
            }
        }
    }
}