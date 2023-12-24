package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,6,12,11,1,2,0,-3,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int end=arr.length-1;
        boolean swapped=true;
        while(swapped && end>=0){
            int max = arr[0], maxInd=0;
            for (int i = 0; i <= end; i++) {
                maxInd = arr[i] > max ? i : maxInd;
                max=arr[maxInd];
            }
            if(arr[end]<max){
                swap(arr,maxInd,end);
                swapped=true;
                end--;
            }else{
                swapped=false;
            }
        }
    }

    private static void swap(int[] arr, int maxInd, int end) {
        int temp = arr[maxInd];
        arr[maxInd]=arr[end];
        arr[end]=temp;
    }
}
