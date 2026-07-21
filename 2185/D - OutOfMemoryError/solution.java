import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long h = sc.nextLong();
            long[] orig = new long[n];
            for (int i = 0; i < n; i++) orig[i] = sc.nextLong();
            long[] add = new long[n];
            int[] lastUpd = new int[n];
            int lastReset = 0;
            for (int time = 1; time <= m; time++) {
                int b = sc.nextInt() - 1;
                long c = sc.nextLong();
                long currentVal;
                if (lastUpd[b] < lastReset) {
                    add[b] = 0;
                    currentVal = orig[b];
                } else {
                    currentVal = orig[b] + add[b];
                }
                long newVal = currentVal + c;
                if (newVal > h) {
                    lastReset = time;
                } else {
                    lastUpd[b] = time;
                    add[b] = newVal - orig[b];
                }
            }
            for (int i = 0; i < n; i++) {
                long ans = (lastUpd[i] < lastReset) ? orig[i] : (orig[i] + add[i]);
                System.out.print(ans + (i == n - 1 ? "
" : " "));
            }
        }
        sc.close();
    }
}