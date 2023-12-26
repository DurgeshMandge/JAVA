//  410. Split Array Largest Sum
//  https://leetcode.com/problems/split-array-largest-sum/description/

// Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the 
// largest sum of any subarray is minimized. Return the minimized largest sum of the split.
// A subarray is a contiguous part of the array.

public class SplitArrayLargestSum {
    static int sum =0;
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        int ans = splitArray(arr,k);
        System.out.println(ans);
    }

    public static int splitArray(int[] nums, int k) {
        int start = max(nums);
        int end = sum, mid;

        while(start<end){
            mid = start+(end-start)/2;
            int n = divide(nums,mid);
            if(n>k){start = mid+1;}
            else{end = mid;}
        }
        return start;
    }

    private static int divide(int[] arr, int maxSum) {
        int pieces =1 , i=0 , sum = 0;
        while(i<arr.length){
            sum += arr[i];
            if(sum > maxSum ){
                pieces++;
                sum=arr[i];
            }
            i++;
        }
        return pieces ;
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
