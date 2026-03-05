class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int zero = 0;
        int one = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                if(s.charAt(i) == '1'){
                    zero++;
                }
                else{
                    one++;
                }
            }
            else{
                if(s.charAt(i) == '1'){
                    one++;
                }
                else{
                    zero++;
                }
            }
        }
        return Math.min(zero, one);
    }
}