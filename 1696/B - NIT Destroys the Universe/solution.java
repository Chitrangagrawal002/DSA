import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int zero = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] == 0) zero++;
            }
            boolean found = false;
            int l = 0;
            int r = n - 1;
            while(l < n && arr[l] == 0){
                l++;
            }
            while(r >= 0 && arr[r] == 0){
                r--;
            }
            for(int i = l; i <= r; i++){
                if(arr[i] == 0){
                    found = true;
                }
            }
            if(zero == n){
                System.out.println(0);
            }
            else if(found){
                System.out.println(2);
            }
            else{
                System.out.println(1);
            }
        }
    }
}