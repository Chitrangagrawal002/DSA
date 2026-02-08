class Solution {
    public boolean isBalanced(String num) {
        int n=num.length();
        int esum=0,osum=0;
        int i=0,j=1;
        while(i<n){
            esum+=num.charAt(i)-'0';
            i+=2;
        }
        while(j<n){
            osum+=num.charAt(j)-'0';
            j+=2;
        }
        return esum==osum;
    }
}