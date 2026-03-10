class Solution {
    Set<String> set = new HashSet<>();
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        helper(nums, new ArrayList<Integer>(), 0, -200);
        return res;
    }
    public void helper(int[] nums, List<Integer> curr, int i, int prev){
        if(curr.size() >= 2){
            String s = curr.toString();
            if(!set.contains(s)){
                res.add(new ArrayList<>(curr));
                set.add(s);
            }
        }
        if(i >= nums.length){
            return;
        }
        if(nums[i] >= prev){
            curr.add(nums[i]);
            helper(nums, curr, i + 1, nums[i]);
            curr.remove(curr.size() - 1);
        }
        helper(nums, curr, i + 1, prev);
    }
}