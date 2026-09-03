class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Arrays.stream(nums1).min().getAsInt();
        if(min % 2 == 1){
            return true;
        }
        for(int num : nums1){
            if(num % 2 == 1){
                return false;
            }
        }
        return true;
    }
}