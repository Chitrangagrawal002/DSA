class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            sb.append((n & 1));
            n >>= 1;
        }
        for(int i = 1; i < sb.length(); i++){
            if(sb.charAt(i) == sb.charAt(i - 1)){
                return false;
            }
        }
        return true;
    }
}