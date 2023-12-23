//  Find position of an element in a sorted array of infinite numbers
//  https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170,210,211,222,223,224,225,226,227,228};
        int target = 100;
        System.out.println(ans(arr,target));
    }

    private static int ans(int[] arr, int target) {
        int start=0, end=1;
        while(target>arr[end]){
            int newStart = end + 1;
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        int mid;
        while(start<=end){
            mid= start+(end-start)/2;
            if(target==arr[mid]){
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
