class Solution {
    public int minPartitions(String n) {
        for(int i = 9; i >= 1; i--){
            if(n.contains(String.valueOf(i))){
                return i;
            }
        }
        return 0;
    }
}