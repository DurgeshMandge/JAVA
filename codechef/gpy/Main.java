package gpy;

public class Main {

    public static long countDistinctArrays(int N, int X) {
        int MOD = 1000000007;
        int[] divisors = new int[X + 1];
        for (int i = 1; i <= X; i++) {
            if (X % i == 0) {
                divisors[i] = 1;
            }
        }
        // Dynamic programming to calculate the number of arrays
        long[] dp = new long[X + 1];
        dp[1] = 1;
        for (int i = 1; i <= N; i++) {
            long[] newDp = new long[X + 1];
            for (int j = 1; j <= X; j++) {
                if (divisors[j] == 1) {
                    for (int k = j; k <= X; k += j) {
                        newDp[k] += dp[j];
                        newDp[k] %= MOD;
                    }
                }
            }
            dp = newDp;
        }
        long totalArrays = 0;
        for (int i = 1; i <= X; i++) {
            totalArrays += dp[i];
            totalArrays %= MOD;
        }
        return totalArrays;
    }

    public static void main(String[] args) {
        int N = 156324; // Max length of arrays
        int X = 959345256; // LCM
        System.out.println("Number of distinct arrays: " + countDistinctArrays(N, X));
    }
}
