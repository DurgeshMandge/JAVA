//  162. Find any one Peak Element In Mountain Array of Multiple peaks
//  https://leetcode.com/problems/find-peak-element/
//  Same approach will work

public class PeakElementMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,7,4};
        System.out.println(findAnyPeak(arr));
    }

    private static int findAnyPeak(int[] arr) {
        int start=0,end=arr.length-1,mid;
        while(start<end){
            mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
}
