import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Long> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(sc.nextLong());
            }
            ArrayList<Long> list = new ArrayList<>(set);
            Collections.sort(list);
            int best = 1;
            int cur = 1;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) == list.get(i - 1) + 1) {
                    cur++;
                } else {
                    cur = 1;
                }
                best = Math.max(best, cur);
            }
            System.out.println(best);
        }
        sc.close();
    }
}