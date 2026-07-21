import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            set.add(ch);
        }
        int need = set.size();
        int left = 0;
        int ans = n;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int right = 0; right < n; right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.size() == need){
                ans = Math.min(ans, right - left + 1);
                char remove = s.charAt(left);
                map.put(remove, map.get(remove) - 1);
                if(map.get(remove) == 0){
                    map.remove(remove);
                }
                left++;
            }
        }
        System.out.println(ans);
    }
}