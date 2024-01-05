package DailyLeetCode;

import java.util.Arrays;

//  https://leetcode.com/problems/longest-increasing-subsequence/?envType=daily-question&envId=2024-01-05
//  300. Longesh Increasing Subsequence

public class SubSequence {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,2,3};
        int[] a = lengthOfLIS(nums);
        System.out.println(Arrays.toString(a));
    }

    private static int[] lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length]; // dp[i]=length of longest subsequence ends at i
        dp[0]=1;
        int max = dp[0];
        for(int i =1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                dp[i]=dp[i-1]+1;
            }else if(nums[i]==nums[i-1]){
                dp[i]=dp[i-1];
            }else{
                for(int j=0;j<i; j++){
                    if(nums[j]<nums[i]){
                        dp[i]=dp[i]+1;
                        break;
                    }else{
                        dp[i]=1;
                    }
                }
            }
            max=(max>dp[i])?max:dp[i];
        }
        System.out.println(max);
        return dp;
    }
}
