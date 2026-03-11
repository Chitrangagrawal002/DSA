class Solution {
    public int findComplement(int num) {
        if(num == 0) return 1;
        long ans = 1;
        while(ans <= num){
            ans <<= 1;
        }
        return (int)(ans - 1) ^ num;
    }
}