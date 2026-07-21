import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            String s = sc.next();
            if(s.length() <= 10){
                System.out.println(s);
            }
            else{
                String ans = s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1);
                System.out.println(ans);
            }
        }
    }
}