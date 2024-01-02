package Patterns;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,33,33,2,43,12,90};
        bubbleRec(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleRec(int[] arr, int lastInd, int ind) {
        if(lastInd == -1){return;}
        if(ind == lastInd){
            bubbleRec(arr, lastInd-1, 0);
        }
        else if(arr[ind]>arr[ind+1]){
            swap(arr,ind,ind+1);
            bubbleRec(arr, lastInd, ind+1);
        }else{
            bubbleRec(arr, lastInd, ind+1);
        }
    }

    private static void swap(int[] arr, int ind, int i) {
        int t = arr[ind];
        arr[ind]=arr[i];
        arr[i]=t;
    }
}
