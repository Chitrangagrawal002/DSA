import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int m = fs.nextInt();
            int x = fs.nextInt();
            int y = fs.nextInt();
 
            // consume the arrays (we don't need their values)
            for (int i = 0; i < n; i++) fs.nextInt();
            for (int j = 0; j < m; j++) fs.nextInt();
 
            sb.append(n + m).append('
');
        }
        System.out.print(sb.toString());
    }
 
    // Fast scanner using buffered InputStream
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
 
        int nextInt() throws IOException {
            int c;
            while ((c = read()) <= ' ' && c >= 0) {}
            int sign = 1;
            if (c == '-') { sign = -1; c = read(); }
            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }
}