import java.io.*;
 
public class Main {
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        FastScanner(InputStream is) { in = is; }
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
        String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = read()) != -1 && Character.isWhitespace(c)) {}
            if (c == -1) return null;
            do {
                sb.append((char)c);
                c = read();
            } while (c != -1 && !Character.isWhitespace(c));
            return sb.toString();
        }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
        long nextLong() throws IOException { return Long.parseLong(next()); }
    }
 
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        String tStr = fs.next();
        if (tStr == null) return;
        int t = Integer.parseInt(tStr);
 
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            long R0 = fs.nextLong();
            long X  = fs.nextLong();
            long D  = fs.nextLong();
            int n   = fs.nextInt();
            String s = fs.next();
            while (s == null || s.length() < n) {
                String tmp = fs.next();
                if (tmp == null) break;
                s = tmp;
            }
 
            long minR = R0, maxR = R0;
            int cnt = 0;
 
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == '1') {
                    // div.1 — always rated
                    cnt++;
                    minR = Math.max(0L, minR - D);
                    maxR = maxR + D;
                } else { // '2'
                    // div.2 — rated only for ratings strictly less than X
                    if (minR >= X) {
                        // all possible ratings are >= X => this particular '2' is unrated,
                        // rating does not change; just continue (do NOT break).
                        continue;
                    } else {
                        // there exists some possible rating < X, so Vasya can make it rated
                        cnt++;
                        minR = Math.max(0L, minR - D);
                        maxR = Math.min(maxR + D, X - 1);
                    }
                }
            }
            out.append(cnt).append('
');
        }
        System.out.print(out.toString());
    }
}