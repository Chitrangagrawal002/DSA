import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            boolean[] present = new boolean[n + 1]; // track numbers 0..n
            int countK = 0;
 
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == k) countK++;       // count k occurrences
                if (arr[i] <= n) present[arr[i]] = true; // mark presence
            }
 
            int missing = 0;
            for (int i = 0; i < k; i++) {
                if (!present[i]) missing++;
            }
 
            System.out.println(Math.max(missing, countK));
        }
        sc.close();
    }
}