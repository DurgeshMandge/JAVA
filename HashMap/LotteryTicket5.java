import java.util.*;

public class LoteryTicket5{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count =0, ans = 0;
        Set<Integer> set = new HashSet<>();
        for(int i =0 ;i <n; i++){
            int k = s.nextInt();
            if(set.contains(k)){
                set.clear();
                ans = ans>count?ans:count;
                count=1;
            }else{
                set.add(k);
                count++;
            }
        }
        System.out.println(ans);
    }
}