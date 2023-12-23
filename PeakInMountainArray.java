//  Peak Element In  Mountain Array
//  https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {3,7,11,4,2,1};
        System.out.println(peak(arr));
    }

    private static int peak(int[] arr) {

        int start=0,end=arr.length-1,mid;

        while(start<end){
            mid=start+(end-start)/2;
            if(end==start){
                return arr[start];
            }
            if(arr[mid]>arr[mid+1]){//u r in decreasing part of array
                end=mid;
            }
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }

        return arr[start];
    }
}
