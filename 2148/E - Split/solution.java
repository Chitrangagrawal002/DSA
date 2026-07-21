import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] first = br.readLine().trim().split(" ");
            int n = Integer.parseInt(first[0]);
            int k = Integer.parseInt(first[1]);
 
            int[] a = new int[n];
            String[] tokens = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(tokens[i]);
 
            // total frequency of each value (values are in [1..n])
            int[] freq = new int[n + 1];
            for (int v : a) freq[v]++;
 
            // If any freq[v] is not divisible by k, answer is 0
            boolean ok = true;
            for (int v = 1; v <= n; v++) {
                if (freq[v] % k != 0) {
                    ok = false;
                    break;
                }
            }
            if (!ok) {
                sb.append(0).append('
');
                continue;
            }
 
            // capacity per value in each multiset
            int[] cap = new int[n + 1];
            for (int v = 1; v <= n; v++) cap[v] = freq[v] / k;
 
            long res = 0;
            int[] cnt = new int[n + 1];
            int l = 0;
            for (int r = 0; r < n; r++) {
                cnt[a[r]]++;
                // if the added element exceeds its capacity, move left pointer
                while (cnt[a[r]] > cap[a[r]]) {
                    cnt[a[l]]--;
                    l++;
                }
                res += (r - l + 1);
            }
 
            sb.append(res).append('
');
        }
        System.out.print(sb.toString());
    }
}