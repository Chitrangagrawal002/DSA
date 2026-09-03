import java.util.*;
public class Main{
    static class Pair{
        int val;
        int idx;
        Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Pair skii[] = new Pair[n];
            Pair movie[] = new Pair[n];
            Pair board[] = new Pair[n];
            for(int i = 0; i < n; i++){
                skii[i] = new Pair(sc.nextInt(), i);
            }
            for(int i = 0; i < n; i++){
                movie[i] = new Pair(sc.nextInt(), i);
            }
            for(int i = 0; i < n; i++){
                board[i] = new Pair(sc.nextInt(), i);
            }
            Arrays.sort(skii, Comparator.comparingInt((Pair p) -> p.val).reversed());
            Arrays.sort(movie, Comparator.comparingInt((Pair p) -> p.val).reversed());
            Arrays.sort(board, Comparator.comparingInt((Pair p) -> p.val).reversed());
            int ans = Integer.MIN_VALUE;
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    for(int k = 0; k < 3; k++){
                        int x = skii[i].idx;
                        int y = movie[j].idx;
                        int z = board[k].idx;
                        if(x == y || y == z || z == x){
                            continue;
                        }
                        ans = Math.max(ans, skii[i].val + movie[j].val + board[k].val);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}