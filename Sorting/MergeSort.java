// a> divide array into 2
// b> sort both array by rec
// c> merge 2 sorted arrays

package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3,53,24,463,134,12,3412,34};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length<=1 ){return arr;}

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, (arr.length)/2));
        int[] right = mergeSort(Arrays.copyOfRange(arr, ((arr.length)/2), (arr.length)));
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] ans = new int[left.length+right.length];
        int i =0, j=0, k =0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                i++;
            }else{
                ans[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            ans[k]=left[i];
            k++;i++;
        }
        while(j<right.length){
            ans[k]=right[j];
            k++;j++;
        }
        return ans;
    }
}
