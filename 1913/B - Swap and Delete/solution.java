import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int n = s.length();
            int zero = 0, one = 0;
            for(char ch : s.toCharArray()){
                if(ch == '0'){
                    zero++;
                }
                else{
                    one++;
                }
            }
            int len = 0;
            for(char ch : s.toCharArray()){
                if(ch == '0' && one > 0){
                    one--;
                    len++;
                }
                else if(ch == '1' && zero > 0){
                    zero--;
                    len++;
                }
                else{
                    break;
                }
            }
            System.out.println(n - len);
        }
        sc.close();
    }
}