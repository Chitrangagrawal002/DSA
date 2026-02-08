class Solution {
    public boolean isBalanced(String num) {
        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            int digit = num.charAt(i) - '0';
            if((i & 1) == 0) sum += digit;
            else sum -= digit;
        }
        return sum == 0;
    }
}