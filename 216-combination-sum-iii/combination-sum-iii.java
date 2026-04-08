class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum3(int k, int n) {
        res = new ArrayList<>();
        helper(k, n, new ArrayList<>(), 0, 1);
        return res;
    }
    public void helper(int k, int n, List<Integer> curr, int sum, int start){
        if(k == 0){
            if(sum == n){
                res.add(new ArrayList<>(curr));
            }
            return;
        }
        if(sum > n){
            return;
        }
        for(int i = start; i < 10; i++){
            curr.add(i);
            helper(k - 1, n, curr, sum + i, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}