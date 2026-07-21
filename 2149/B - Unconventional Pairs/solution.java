import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
 
            int diff = 0;
            // Pair consecutive elements after sorting
            for (int i = 0; i < n; i += 2) {
                diff = Math.max(diff, arr[i + 1] - arr[i]);
            }
 
            System.out.println(diff);
        }
        sc.close();
    }
}