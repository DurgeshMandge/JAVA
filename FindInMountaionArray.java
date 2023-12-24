// 1050. Searching in Mountain Array
//  https://leetcode.com/problems/find-in-mountain-array/
//  1. we'll get peak and then search between
//  --> 1st and peak if not found then
//  --> peak and last

public class FindInMountaionArray {
    public static void main(String[] args) {
        int[] arr = {1,5,21,4,2,1};
        int target =2;
        System.out.println(findInMountainArray(target, arr));
    }
    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = findPeak(mountainArr,target);
        int firstTry = binarySearchInc(mountainArr,target,0,peak);
        if(firstTry==-1){
            return binarySearchDec(mountainArr,target,peak,mountainArr.length-1);
        }
        return firstTry;
    }

    private static int findPeak(int[] mountainArr, int target) {
        int start=0,end=mountainArr.length-1,mid;
        while(start<end){
            mid=start+(end-start)/2;
            if(mountainArr[mid]<mountainArr[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }

    private static int binarySearchInc(int[] arr,int target,int start,int end){
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int binarySearchDec(int[] arr,int target,int start,int end){
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target<arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
