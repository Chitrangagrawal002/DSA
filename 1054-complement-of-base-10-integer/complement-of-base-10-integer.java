class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int rem = n % 2;
            sb.append(1 - rem);
            n /= 2;
        }
        int add = 0;
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == 0){
                continue;
            }
            add += (sb.charAt(i) - '0') * Math.pow(2, i);
        }
        return add;
    }
}