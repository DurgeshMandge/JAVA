// 33. Search In Rotated Search Array
//  https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInRotatedSortArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int[] arr2={1,2,1};
        int target = 1;
        System.out.println(rotedSearch(arr,target));
        System.out.println(findPivot(arr2));
    }

    private static int rotedSearch(int[] arr, int target) {
        int pivot = findPivot(arr);
        int firstTry = binarySeary(arr,target,0,pivot);
        if(firstTry == -1){
            return binarySeary(arr,target,pivot+1,arr.length-1);
        }
        return firstTry;
    }

    private static int findPivot(int[] arr) {
        int start=0,end=arr.length-1,mid;
        while (start<=end) {
            mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]>arr[start]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    private static int binarySeary(int[] arr, int target, int start, int end) {
        int mid;
        while (start<=end) {
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
}
