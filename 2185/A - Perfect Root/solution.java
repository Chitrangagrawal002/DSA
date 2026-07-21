import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
 
            for (int i = 1; i <= n; i++) {
                long x = 1L * i * i;
                System.out.print(x);
                if (i < n) System.out.print(" ");
            }
            System.out.println();
        }
 
        sc.close();
    }
}