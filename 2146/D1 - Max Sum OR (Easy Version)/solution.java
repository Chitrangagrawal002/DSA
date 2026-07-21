import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
 
        String line = br.readLine();
        while (line != null && line.trim().isEmpty()) line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
 
        for (int tc = 0; tc < t; tc++) {
            // read next non-empty line with l r
            line = br.readLine();
            while (line != null && line.trim().isEmpty()) line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
 
            int n = r - l + 1;
            int[] ans = new int[n];      // ans[i] = value placed at position corresponding to b = l + i
            boolean[] used = new boolean[n];
 
            long sum = 0L;
 
            for (int x = r; x >= l; x--) {
                int xi = x - l;
                if (used[xi]) continue;
 
                // compute initial mask = (1 << (floor(log2(x)) + 1)) - 1
                int mask = 1;
                while (mask <= x) mask <<= 1;
                mask -= 1;
 
                int y = mask ^ x;
                // reduce mask until y in [l, r] and unused
                while (y < l || y > r || used[y - l]) {
                    mask >>= 1;                 // next lower (2^k - 1)
                    y = mask ^ x;
                    // mask can become 0 -> then y == x
                    if (mask == 0) break;
                }
 
                if (y == x) {
                    // fixed point
                    ans[xi] = x;
                    used[xi] = true;
                    sum += (x | x); // which is x
                } else {
                    int yi = y - l;
                    ans[xi] = y;
                    ans[yi] = x;
                    used[xi] = true;
                    used[yi] = true;
                    sum += (long)(x | y) * 2L; // both positions contribute (x|y)
                }
            }
 
            out.append(sum).append('
');
            for (int i = 0; i < n; i++) {
                out.append(ans[i]);
                if (i + 1 < n) out.append(' ');
            }
            out.append('
');
        }
 
        System.out.print(out.toString());
    }
}