import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long[] pref = new long[n + 1];
            pref[0] = 0;
            for (int i = 0; i < n; i++) {
                pref[i + 1] = pref[i] + arr[i];
            }
            long ans = 0;
            for(int x = 0; x <= k; x++){
                int left = 2 * x;
                int right = n - (k - x);
                long sum = pref[right] - pref[left];
                ans = Math.max(ans, sum);
            }
            System.out.println(ans);
        }
    }
}