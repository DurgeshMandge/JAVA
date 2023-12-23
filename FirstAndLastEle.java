// 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLastEle {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;//output=[3,4];
        int[] ans = searchRange(arr, target);
        System.out.println(ans[0]+" "+ ans[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = searchRangeFirst(nums,target);
        int last = searchRangeLast(nums,target);
        return new int[]{first,last};
    }

    private static int searchRangeFirst(int[] nums, int target) {
        int first = -1;
        int start = 0, end = nums.length-1, mid;
        while (start<=end){
            mid = start+(end-start)/2;
            if(target==nums[mid]){
                first=mid;
                end = mid-1;
            }else if(target<nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return first;
    }


    private static int searchRangeLast(int[] nums, int target) {
        int last = -1;
        int start = 0, end = nums.length-1, mid;
        while(start<=end){
            mid = start+(end-start)/2;
            if(target==nums[mid]){
                last=mid;
                start=mid+1;
            }else if(target<nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return last;
    }
}
