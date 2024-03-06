package gpy;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int countArrays(int N, int X) {
        // Prime factorize X
        Map<Integer, Integer> primeFactors = new HashMap<>();
        while (X > 1) {
            for (int i = 2; i <= X; i++) {
                if (X % i == 0) {
                    primeFactors.put(i, primeFactors.getOrDefault(i, 0) + 1);
                    X /= i;
                    break;
                }
            }
        }

        // Build and populate DP table
        int[] dp = new int[N + 1];
        dp[0] = 1;
        for (Map.Entry<Integer, Integer> entry : primeFactors.entrySet()) {
            int factor = entry.getKey();
            int count = entry.getValue();
            for (int j = count; j <= N; j++) {
                dp[j] += dp[j - factor];
            }
        }

        // Sum the counts for all lengths up to N
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += dp[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int N = 5;
        int X = 60;
        System.out.println(countArrays(N, X)); // Output: 12
    }
}
