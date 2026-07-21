import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int grid[][] = new int[n][m];
            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;
            int neg = 0;
            int total = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    grid[i][j] = sc.nextInt();
                    total += Math.abs(grid[i][j]);
                    if(grid[i][j] < 0)  min = Math.max(min, grid[i][j]);
                    if(grid[i][j] >= 0) max = Math.min(max, grid[i][j]);
                    if(grid[i][j] < 0) neg++;
                }
            }
            if(neg % 2 == 0) System.out.println(total);
            else{
                int x = Math.min(Math.abs(min), max);
                total -= 2 * x;
                System.out.println(total);
            }
        }
        sc.close();
    }
}