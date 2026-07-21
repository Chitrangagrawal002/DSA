import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n+1];
            for(int i=1; i<=n; i++){
                a[i] = sc.nextInt();
            }
            int pos = -1;
            for(int i=1; i<=n; i++){
                if(a[i] == 1){
                    pos = i;
                    break;
                }
            }
            if(pos == -1){
                for(int i=1; i<=n; i++){
                    System.out.print(i+" ");
                }
                System.out.print(n+1);
            }
            else{
                for(int i=1; i<pos ; i++){
                    System.out.print(i + " ");
                }
                System.out.print((n+1) + " ");
                for(int i=pos; i<=n; i++){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}