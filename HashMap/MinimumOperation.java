/**
 * 2870. Minimum Operation Required TO Make Array Empty
 * https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/?envType=daily-question&envId=2024-01-04
 */

package HashMap;

import java.util.HashMap;

public class MinimumOperation {

    public static void main(String[] args) {
        int[] arr = {2,3,3,2,2,4,2,3,4};
        int ans = minOperations(arr);
        System.out.println(ans);
    }
    
    public static int minOperations(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int ans = 0;
        for(int n : nums){
            m.put(n,m.getOrDefault(n, 0)+1);
        }
        
        System.out.println(m.toString());
        if (m.containsValue(1)){
            return -1;
        }
        for(int entry: m.values()){
            if(entry % 3 == 0){
                ans += entry/3;
            }else{
                ans += entry/3 +1 ;
            }
        }
        return ans;
    }
}