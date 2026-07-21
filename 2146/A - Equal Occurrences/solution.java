import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i : arr){
                map.put(i, map.getOrDefault(i, 0)+1);
            }
            int maxfreq = 0;
            for(int i : map.values()){
                maxfreq = Math.max(maxfreq, i);
            }
            int ans = 0;
            for (int f = 1; f <= maxfreq; f++) {
                int count = 0;
                for (int val : map.values()) {
                    if (val >= f) {
                        count++;
                    }
                }
                ans = Math.max(ans, f * count);
            }
 
            System.out.println(ans);
        }
    }
}