import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // length of array
            int neg = 0;   // count of -1
            int zero = 0;  // count of 0
 
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val == -1) neg++;
                else if (val == 0) zero++;
            }
 
            int ans = 0;
 
            // Step 1: convert all zeros into 1
            ans += zero;
 
            // Step 2: if number of -1's is odd, we must flip one (-1 → 1)
            if (neg % 2 != 0) {
                ans += 2;
            }
 
            System.out.println(ans);
        }
        sc.close();
    }
}