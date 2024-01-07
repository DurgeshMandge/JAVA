package HackerRank;

import java.util.Arrays;

public class GameOfStack2 {
    public static void main(String[] args) {
        int[] m ={1,2,3,4,5};
        int[] n ={6,7,8,9};
        int maxSum =12;
        int ans = twoStacks(maxSum,m,n);
        System.out.println(ans);
    }
    
    public static int twoStacks(int maxSum, int[] a, int[] b) {
        return helper(a,b,0,maxSum,0)-1;
    }

    private static int helper(int[] a, int[] b, int sum, int maxSum, int count) {
        if(sum>maxSum){
            return count;
        }

        if(a.length==0 || b.length==0){
            return count;
        }

        int left = helper(Arrays.copyOfRange(a, 1, a.length), b, sum+a[0], maxSum, count+1);
        int right = helper(a, Arrays.copyOfRange(b, 1, b.length), sum+b[0], maxSum, count+1);

        return Math.max(left,right);
    }
}
