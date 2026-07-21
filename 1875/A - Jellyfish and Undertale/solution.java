import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }
            long ans = b;
            for(int i = 0; i < n; i++){
                ans += Math.min(arr[i], a - 1);
            }
            System.out.println(ans);
        }
    }
}