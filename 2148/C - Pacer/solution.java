import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            long m = fs.nextLong();
            long[] a = new long[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextLong();
                b[i] = fs.nextInt();
            }
 
            long ans = 0;
 
            // segment from 0 to a[0]
            long d = a[0];
            int need = b[0];
            if (d % 2 == need) ans += d;
            else ans += d - 1;
 
            // segments between requirements
            for (int i = 0; i + 1 < n; i++) {
                d = a[i + 1] - a[i];
                int diff = b[i] ^ b[i + 1];
                if (d % 2 == diff) ans += d;
                else ans += d - 1;
            }
 
            // after last requirement
            ans += (m - a[n - 1]);
 
            sb.append(ans).append('
');
        }
        System.out.print(sb.toString());
    }
 
    // Fast scanner
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
 
        long nextLong() throws IOException {
            int c;
            while ((c = read()) <= ' ' && c >= 0) {}
            int sign = 1;
            if (c == '-') { sign = -1; c = read(); }
            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
 
        int nextInt() throws IOException { return (int) nextLong(); }
    }
}