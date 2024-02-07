public class EqualSumPartition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5,5};
        System.out.println(equalSumPartition(arr,3));
    }

    private static boolean equalSumPartition(int[] arr,  int i) {
        return subsetsum(arr,i, sum(arr)/2);
    }
    
    private static int sum(int[] arr) {
        int sum =0;
        for(int i : arr){
            sum+=i;
        }
        return sum;
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
