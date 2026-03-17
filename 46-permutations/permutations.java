class Solution {
    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(nums, curr, res, 0);
        return res;
    }
    public void helper(int[] nums, List<Integer> curr, List<List<Integer>> res, int idx){
        if(idx == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = idx; i < nums.length; i++){
            swap(nums, i, idx);
            curr.add(nums[idx]);
            helper(nums, curr, res, idx + 1);
            curr.remove(curr.size() - 1);
            swap(nums, i, idx);
        }
    }
}