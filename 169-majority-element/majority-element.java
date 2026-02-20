class Solution {
    public int majorityElement(int[] nums) {
        int counter = 1;
        int major = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] == major){
                counter++;
            }
            else{
                counter--;
            }
            if(counter == 0){
                major = nums[i];
                counter = 1;
            }
        }
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(major == nums[i]){
                count++;
            }
        }
        if(count > nums.length/2){
            return major;
        }
        return -1;
    }
}