import java.util.*;
 
public class Main {
    public static long minSwaps(List<Integer> pos) {
        int m = pos.size();
        if (m == 0) return 0;
 
        long[] shifted = new long[m];
        for (int i = 0; i < m; i++) {
            shifted[i] = pos.get(i) - i;
        }
 
        Arrays.sort(shifted);
 
        long median = shifted[m / 2];
        long swaps = 0;
        for (int i = 0; i < m; i++) {
            swaps += Math.abs(shifted[i] - median);
        }
        return swaps;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            List<Integer> posA = new ArrayList<>();
            List<Integer> posB = new ArrayList<>();
 
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'a') posA.add(i);
                else posB.add(i);
            }
 
            long movesA = minSwaps(posA);
            long movesB = minSwaps(posB);
 
            System.out.println(Math.min(movesA, movesB));
        }
        sc.close();
    }
}