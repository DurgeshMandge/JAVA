package gpt;

// import java.util.Scanner;

// public class Main {
//     public static final int MOD = 998244353;

//     public static long countDistinctArrays(int N, int X) {
//         long[][] dp = new long[N + 1][X + 1];
//         dp[0][1] = 1;
//         for (int i = 1; i <= N; i++) {
//             for (int j = 1; j <= X; j++) {
//                 for (int k = j; k <= X; k += j) {
//                     dp[i][k] += dp[i - 1][j];
//                     dp[i][k] %= MOD;
//                 }
//             }
//         }
//         long totalArrays = 0;
//         for (int i = 1; i <= X; i++) {
//             totalArrays += dp[N][i];
//             totalArrays %= MOD;
//         }
//         return totalArrays;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int T = scanner.nextInt(); // Number of test cases
//         while (T-- > 0) {
//             int N = scanner.nextInt(); // Max length of arrays
//             int X = scanner.nextInt(); // LCM
//             System.out.println(countDistinctArrays(N, X));
//         }
//         scanner.close();
//     }
// }
import java.util.Scanner;

public class Main {
    public static final int MOD = 998244353;

    // Function to calculate the prime factorization of a number
    public static long primeFactorization(int X) {
        long result = 1;
        for (int i = 2; i * i <= X; i++) {
            int count = 0;
            while (X % i == 0) {
                X /= i;
                count++;
            }
            if (count > 0) {
                result *= (count + 1);
                result %= MOD;
            }
        }
        if (X > 1) {
            result *= 2; // If X is prime
            result %= MOD;
        }
        return result;
    }

    // Function to calculate the total number of arrays
    public static long countArrays(int N, int X) {
        return modPow(N + 1, primeFactorization(X), MOD);
    }

    // Function to calculate power modulo MOD
    public static long modPow(long base, long exponent, long mod) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        while (T-- > 0) {
            int N = scanner.nextInt(); // Max length of arrays
            int X = scanner.nextInt(); // LCM
            System.out.println(countArrays(N, X));
        }
        scanner.close();
    }
}
