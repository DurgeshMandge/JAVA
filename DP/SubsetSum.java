public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int target = 9;
        System.out.println(subsetsum(arr,6,target));
    }

    private static boolean subsetsum(int[] arr,int n, int target) {
        boolean[][] dp = new boolean[n+1][target+1];
        
        for(int i=0;i<n+1;i++){
            dp[0][i]=false;
        }
        for(int i=0;i<n+1;i++){
            dp[i][0]=true;
        }

        for(int numInd=1;numInd<=n;numInd++){
            for(int targ=1;targ<=target;targ++){
                if(arr[numInd-1]<=targ){
                    dp[numInd][targ]= dp[numInd-1][targ-arr[numInd-1]] || dp[numInd-1][targ];
                }else{
                    dp[numInd][targ]=dp[numInd-1][targ];
                }
            }
        }

        return dp[n][target];
    }
}
