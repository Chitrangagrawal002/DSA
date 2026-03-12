class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length() % 2 == 1) return false;
        int n = s.length();
        int available = 0;
        int balance = 0;
        for(int i = 0; i < n; i++){
            if(locked.charAt(i) == '0') available++;
            else{
                if(s.charAt(i) == '(') balance++;
                else balance--;
            }
            if(balance + available < 0) return false;
        }
        balance = 0;
        available = 0;
        for(int i = n - 1; i >= 0; i--){
            if(locked.charAt(i) == '0') available++;
            else{
                if(s.charAt(i) == ')') balance++;
                else balance--;
            }
            if(balance + available < 0) return false;
        }
        
        return true;
    }
}