class Solution {
    public String smallestSubsequence(String s, int k, char letter, int repetition) {
        int n = s.length();
        int remain = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == letter) remain++;
        }
        char[] st = new char[k];
        int top = 0;  
        int used = 0;             
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == letter) remain--;
            while (top > 0 && st[top - 1] > c) {
                if ((top - 1) + (n - i) < k) break;
                if (st[top - 1] == letter) {
                    if ((used - 1) + remain < repetition) break;
                    used--;
                }
                top--;
            }
            if (top < k) {
                if (c == letter) {
                    st[top++] = c;
                    used++;
                } else {
                    int slots = k - top;
                    int needed = repetition - used;
                    if (slots > needed) {
                        st[top++] = c;
                    }
                }
            }
        }
        return new String(st, 0, k);
    }
}
