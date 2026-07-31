import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = 1;
        int start = 0;
        int i = 0;
        while(i < n - 1){
            start = i;
            while(i < n - 1 && arr[i] <= arr[i + 1]){
                i++;
            }
            ans = Math.max(ans, i - start + 1);
            i++;
        }
        System.out.println(ans);
    }
}