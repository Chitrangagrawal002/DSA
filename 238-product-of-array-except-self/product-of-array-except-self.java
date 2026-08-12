class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        res[0] = nums[0];
        for(int i = 1; i < n; i++){
            res[i] = res[i - 1] * nums[i];
        }
        int prod = 1;
        for(int i = n - 1; i >= 0; i--){
            if(i == n - 1){
                res[i] = res[i - 1];
            }
            else if(i == 0){
                res[i] = prod;
            }
            else{
                res[i] = res[i - 1] * prod;
            }
            prod *= nums[i];
        }
        return res;
    }
}