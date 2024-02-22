public class Solution {
    public static void main(String[] args) {
        String str1 ="tyfg" , str2 ="cvbnuty" ;
        System.out.println(lcs(str1,str2));
    }
    public static int lcs(String str1, String str2){
        int l = str1.length(), m = str2.length();
        int[][] dp = new int[l+1][m+1];
        int max = -1;
        for(int firstInd =0; firstInd< l+1; firstInd++){
            for(int secInd = 0; secInd< m+1; secInd++){
                if(firstInd==0 || secInd==0){
                    dp[firstInd][secInd]=0;
                }else{
                    if(str1.charAt(firstInd-1)==str2.charAt(secInd-1)){
                        dp[firstInd][secInd]= 1 + dp[firstInd-1][secInd-1];
                        max = max>dp[firstInd][secInd] ? max : dp[firstInd][secInd];
                    }else{
                        dp[firstInd][secInd]=0;
                    }
                }
            }
        }
        return max;
    }
}
