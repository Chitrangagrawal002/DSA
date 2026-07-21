import java.util.Scanner;
 
public class MaximumEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }
 
    private static void solve(Scanner scanner) {
        long a = scanner.nextLong();
        long b = scanner.nextLong();
 
        if (a % 2 != 0 && b % 2 != 0) {
            long res = Math.max(a + b, a * b + 1);
            System.out.println(res);
        } 
        else if (a % 2 == 0 && b % 2 != 0) {
            System.out.println(-1);
        } 
        else if (a % 2 == 0 && b % 2 == 0) {
            long res = Math.max(a + b, a * b / 2 + 2);
            System.out.println(res);
        } 
        else {
            if (b % 4 != 0) {
                System.out.println(-1);
            } else {
                long res = Math.max(2 * a + b / 2, a * b / 2 + 2);
                System.out.println(res);
            }
        }
    }
}