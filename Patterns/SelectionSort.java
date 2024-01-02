package Patterns;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {31,5,23,100,2,2};
        selectionRec(arr , 0 , 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionRec(int[] arr,int current, int maxInd, int lastInd) {
        if(lastInd <= 0){return;}
        if(arr[current] > arr[maxInd]){
            maxInd = current;
        }
        if(current == lastInd){
            swap(arr,maxInd,lastInd);
            selectionRec(arr, 0, 0, lastInd-1);
        }else{
            selectionRec(arr, current+1, maxInd, lastInd);
        }
    }

    private static void swap(int[] arr, int p, int q) {
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q]=temp;
    }
}
