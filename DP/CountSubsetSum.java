public class CountSubsetSum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        int target = 1;
        System.out.println(countsubsetsum(arr,target,4));
    }

    private static int countsubsetsum(int[] arr, int target, int n) {
        int[][] dp = new int[n+1][target+1];

        for(int i=0;i<n+1;i++){
            dp[0][i]=0;
        }
        for(int i=0;i<n+1;i++){
            dp[i][0]=1;
        }
        for(int numInd=1;numInd<n+1;numInd++){
            for(int targ=1;targ<target+1;targ++){
                if(arr[numInd-1]<=targ){
                    dp[numInd][targ]= dp[numInd-1][targ-arr[numInd-1]] + dp[numInd-1][targ];
                }else{
                    dp[numInd][targ] = dp[numInd-1][targ];
                }
            }
        }

        return dp[n][target];
    }
}
