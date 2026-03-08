class Solution {
    Set<String> set = new HashSet<>();
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        for(String s : nums){
            set.add(s);
        }
        return helper(n, "");
    }
    public String helper(int n, String curr){
        if(curr.length() == n){
            if(!set.contains(curr)){
                return curr;
            }
            return "";
        }
        String ans = helper(n, curr + "0");
        if(ans.length() > 0){
            return ans;
        }
        return helper(n, curr + "1");
    }
}