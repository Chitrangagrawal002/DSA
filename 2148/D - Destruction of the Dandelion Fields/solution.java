import java.util.*;
import java.io.*;
public class Main{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
 
            ArrayList<Long> odd = new ArrayList<>();
            long evenSum = 0;
 
            for (long val : arr) {
                if (val % 2 == 0) evenSum += val;
                else odd.add(val);
            }
            Collections.sort(odd, Collections.reverseOrder());
            long sum = evenSum;
            for (int i = 0; i < (odd.size() + 1) / 2; i++) {
                sum += odd.get(i);
            }
            if(odd.size()==0){
                System.out.println(0);
            }
            else{
                System.out.println(sum);
            }
        }
    }
}