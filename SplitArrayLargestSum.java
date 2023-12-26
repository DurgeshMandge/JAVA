//  410. Split Array Largest Sum
//  https://leetcode.com/problems/split-array-largest-sum/description/

// Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the 
// largest sum of any subarray is minimized. Return the minimized largest sum of the split.
// A subarray is a contiguous part of the array.

public class SplitArrayLargestSum {
    static int sum =0;
    static int largestSum =0;
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int ans = minimizedSum(arr,k);
        System.out.println(ans);
    }

    private static int minimizedSum(int[] arr, int k) {
        int start = max(arr);
        int end = sum, mid;

        while(start<end){
            mid = start+(end-start)/2;
            int n = divide(arr,mid);
            // if(n == k){return largestSum;}
            if(n>k){start = mid+1;}
            else{end = mid;}
        }
        return start;
    }

    private static int divide(int[] arr, int maxSum) {
        int ans =0 , i=0 , sum = 0;
        while(i<arr.length){
            sum += arr[i];
            if(sum > maxSum || i==arr.length-1){
                ans++;
                largestSum = (sum-arr[i])>largestSum?(sum-arr[i]):largestSum;
                if(i!=arr.length-1){
                    i--;
                }else{
                    largestSum = (sum)>largestSum?(sum):largestSum;
                }
                sum=0;
            }
            i++;
        }
        return ans ;
    }

    private static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max ;
            sum+=arr[i];
        }
        return max;
    }
}
