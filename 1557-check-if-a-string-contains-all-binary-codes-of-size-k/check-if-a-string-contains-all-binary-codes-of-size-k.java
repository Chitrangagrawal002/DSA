class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        int codes = 1 << k;
        if (n - k + 1 < codes) return false;
        boolean[] set = new boolean[codes];
        for (int i = 0; i <= n - k; i++) {
            String curr = s.substring(i, i + k);
            int num = Integer.parseInt(curr, 2);
            if (!set[num]) {
                set[num] = true;
                codes--;
                if (codes == 0) return true;
            }
        }
        return false;
    }
}