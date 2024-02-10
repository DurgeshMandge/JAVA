public class RodCutting {

    public static void main(String[] args) {
        int[] len = {1,2,3,4,5,6,7,8};
        int[] price = {1,5,8,9,10,17,17,20};

        System.out.println(unboundKnapsack(len,price,8));
    }

    private static int unboundKnapsack(int[] len, int[] price, int l) {
        int[][] dp = new int[l+1][l+1];
        for(int i=0;i<l+1;i++){
            for(int j=0;j<l+1;j++){
                if(i==0 && j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int lenInd=1;lenInd<l+1;lenInd++){
            for(int profit=1;profit<l+1;profit++){
                if(len[lenInd-1]<=lenInd){
                    dp[lenInd][profit] = price[lenInd-1] + dp[lenInd][profit-price[lenInd-1]];
                }else{
                    dp[lenInd][profit]= dp[lenInd-1][profit];
                }

            }
        }
        return dp[l][l];
    }
}