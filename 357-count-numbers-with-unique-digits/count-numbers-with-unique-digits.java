class Solution {
    int count = 0;
    public int countNumbersWithUniqueDigits(int n) {
        boolean[] used = new boolean[10];
        dfs(n, 0, used);
        return count + 1;
    }
    public void dfs(int n, int length, boolean[] used) {
        if (length > n) return;
        if (length > 0) count++;
        for (int i = 0; i < 10; i++) {
            if (used[i]) continue;
            if (length == 0 && i == 0) continue;
            used[i] = true;
            dfs(n, length + 1, used);
            used[i] = false;
        }
    }
}