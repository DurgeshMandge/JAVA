public class MinNumOfCoins {
    public static void main(String[] args) {
        int[] coins = {9, 6, 5, 1};
        int target = 11;
        System.out.println(minNumCoins(coins,target,4));
    }

    private static int minNumCoins(int[] coins, int target, int n) {
        int[][] dp = new int[n+1][target+1];
        for(int i=0;i<n+1;i++){
            dp[i][0] = 0;
        }
        for(int i=0;i<n+1;i++){
            dp[0][i] =1000-1;
            if(i>0){
                dp[1][i] = i % coins[i-1]==0 ? i/coins[i-1] : 1000-1;
            }
        }

        for(int coinInd = 2; coinInd< n+1; coinInd++){
            for(int tar =1; tar< target+1; tar++){
                if(tar>=coins[coinInd-1]){
                    dp[coinInd][tar] = Math.min( 1 + dp[coinInd][tar - coins[coinInd-1]] , dp[coinInd-1][tar]);
                }else{
k                    dp[coinInd][tar] = dp[coinInd-1][tar];
                }
            }
        }
        return dp[n][target];
    }
}
