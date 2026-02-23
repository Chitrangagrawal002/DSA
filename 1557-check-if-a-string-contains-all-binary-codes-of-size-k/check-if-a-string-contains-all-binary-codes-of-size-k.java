class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        int codes = 1 << k;
        if(n - k + 1 < codes) return false;
        HashSet<Integer> set = new HashSet<>();
        int mask = codes - 1;
        int hash = 0;
        for(int i = 0; i < n; i++){
            hash = ((hash << 1) & mask) | (s.charAt(i) - '0');;
            if(i >= k - 1){
                if(!set.contains(hash)){
                    set.add(hash);
                    codes--;
                }
                if(codes == 0) return true;
            }
        }
        return false;
    }
}