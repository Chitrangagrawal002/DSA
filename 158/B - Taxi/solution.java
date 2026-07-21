import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[5];
        for (int i = 0; i < n; i++) {
            cnt[sc.nextInt()]++;
        }
        int ans = 0;
        ans += cnt[4];
        ans += cnt[3];
        cnt[1] = Math.max(0, cnt[1] - cnt[3]);
        ans += cnt[2] / 2;
        cnt[2] %= 2;
        if (cnt[2] == 1) {
            ans++;
            cnt[1] = Math.max(0, cnt[1] - 2);
        }
        ans += (cnt[1] + 3) / 4;
        System.out.println(ans);
    }
}