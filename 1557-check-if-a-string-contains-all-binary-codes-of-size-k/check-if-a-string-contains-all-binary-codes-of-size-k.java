class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        int codes = 1 << k;
        if (n - k + 1 < codes) return false;
        HashSet<String> set = new HashSet<>();
        for(int i = k; i <= n; i++){
            String curr = s.substring(i - k, i);
            if(!set.contains(curr)){
                set.add(curr);
                codes--;
            }
            if(codes == 0){
                return true;
            }
        }
        return false;
    }
}