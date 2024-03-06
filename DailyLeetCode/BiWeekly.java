import java.util.Arrays;

public class BiWeekly {
    public static void main(String[] args) {
        int[] arr = {1000000000,999999999,1000000000,999999999,1000000000,999999999};
        System.out.println(minOperations(arr, 1000000000));
    }
    public static int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums[0]>=k){return 0;}
        int i=1;
        while(i<nums.length && nums[i]<k){
            nums[i]+=2*nums[i-1];
            arrange(nums,i);
            i++;
        }
        return i-1;
    }
    static void arrange(int[] arr,int i){
        int temp;
        while(i<arr.length-1 && arr[i]<arr[i+1]){
            temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
}