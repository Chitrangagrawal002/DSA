class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int count = 0;
        for (int player = 0; player < n; player++) {
            int[] colors = new int[11];
            for (int[] p : pick) {
                if (player == p[0]) {
                    if (++colors[p[1]] > player) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}