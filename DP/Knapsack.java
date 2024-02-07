// package DP;

public class Knapsack {
    
    public static void main(String[] args) {
        int[] wt = {3,5,2,4};
        int[] val = {4,23,5,2};
        int W = 10;
        System.out.println(knap(wt,val,W,4));
        
    }

    private static int knap(int[] wt, int[] val, int W, int n) {
        int[][] dp = new int[n+1][W+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }

        for(int numInd=1;numInd<=n;numInd++){
            for(int capacity=1;capacity<=W;capacity++){
                if(capacity >= wt[numInd-1]){
                    dp[numInd][capacity]= (int)Math.max( val[numInd-1] + dp[numInd-1][capacity-wt[numInd-1]] , dp[numInd-1][capacity]);
                }else{
                    dp[numInd][capacity]= dp[numInd-1][capacity];
                }
            }
        }
        return dp[n][W];
    }

//     private static int knap(int[] wt, int[] val, int W, int n) {
//         int[][] dp = new int[n+1][W+1];
//         for(int i=0;i<n+1;i++){
//             for(int j=0;j<W+1;j++){
//                 if(i==0 || j==0){
//                     dp[i][j]=0;
//                 }
//             }
//         }

//         for(int itemNum=1;itemNum<n+1;itemNum++){
//             for(int capacity=1; capacity<W+1; capacity++){
//                 if(wt[itemNum-1]<=capacity){
//                     dp[itemNum][capacity]= (int)Math.max( val[itemNum-1] + dp[itemNum-1][capacity-wt[itemNum-1]], dp[itemNum-1][capacity]);
//                 }
//                 else{
//                     dp[itemNum][capacity]= dp[itemNum-1][capacity];
//                 }
//             }
//         }
//         return dp[n][W];
//     }

//     // KnapSack Recursive

    
    
}
