import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int left = 0;
        int right = m - 1;
        int min = Integer.MAX_VALUE;
        while(right < n){
            min = Math.min(min, arr[right] - arr[left]);
            right++;
            left++;
        }
        System.out.println(min);
    }
}