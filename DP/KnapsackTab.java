public class KnapsackTab {
    public static void main(String[] args) {
        int[] val = {4,23,5,2};
        int[] wt = {3,5,2,4};
        int W = 10;
        System.out.println(tabular(val, wt, W, 4));
    }

    static int tabular(int[] val, int[] wt, int W, int n) {
        int[][] dp = new int[n + 1][W + 1];
        for(int i = 0; i < n + 1; i++) {
            for(int j = 0; j < W + 1; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        
        for(int itemNum = 1; itemNum <= n; itemNum++) {
            for(int capacity = 1; capacity <= W; capacity++) {
                if(wt[itemNum - 1] <= capacity) {
                    dp[itemNum][capacity] = Math.max(val[itemNum - 1] + dp[itemNum - 1][capacity - wt[itemNum - 1]], dp[itemNum - 1][capacity]);
                } else {
                    dp[itemNum][capacity] = dp[itemNum - 1][capacity];
                }
            }
        }
        return dp[n][W];
    }
}
