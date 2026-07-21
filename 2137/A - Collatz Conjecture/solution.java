import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int k = scanner.nextInt();
            long x = scanner.nextInt();
            
            for (int i = 0; i < k; i++) {
                if ((x - 1) % 3 == 0) {
                    long potential_odd = (x - 1) / 3;
                    if (potential_odd > 0 && potential_odd % 2 != 0) {
                        x = potential_odd;
                    } else {
                        x = 2 * x;
                    }
                } else {
                    x = 2 * x;
                }
            }
            System.out.println(x);
        }
        scanner.close();
    }
}