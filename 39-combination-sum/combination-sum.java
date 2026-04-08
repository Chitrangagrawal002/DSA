class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] arr, int k) {
        res = new ArrayList<>();
        helper(arr, k, new ArrayList<>(), 0, 0);
        return res;
    }
    public void helper(int[] arr, int k, List<Integer> curr, int i, int sum){
        if(sum == k){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(sum > k || i >= arr.length){
            return;
        }
        curr.add(arr[i]);
        helper(arr, k, curr, i, sum + arr[i]);
        curr.remove(curr.size() - 1);
        helper(arr, k, curr, i + 1, sum);
    }
}