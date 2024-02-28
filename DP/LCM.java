class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length(), n=text2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = 0;
        }
        for(int xLen=1; xLen<m ; xLen++){
            for(int yLen=1; yLen<n ; yLen++){
                if(text1.charAt(xLen-1) == text2.charAt(yLen-1)){
                    dp[xLen][yLen]= 1+ dp[xLen-1][yLen-1];
                }else{
                    dp[xLen][yLen] = Math.max(dp[xLen-1][yLen],dp[xLen][yLen-1]);
                }
            }
        }
        return dp[m][n];
    }
}