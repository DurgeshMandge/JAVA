package Sorting;

import java.util.Arrays;

public class MergeInPlace {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3,53,24,463,134,12,3412,34};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int s, int e) {
        if(e-s == 1){
            return;
        }
        int m = (s+e)/2;
        mergeSort(arr, s, m);
        mergeSort(arr, m, e);
        merge(arr, s, m, e);
    }

    static void merge(int[] arr, int s, int m, int e){
        int[] ans= new int[e-s];
        int a=0, b=m, c=0;
        while(a<m && b<e){
            if(arr[a]<arr[b]){
                ans[c]=arr[a]; a++;
            }else{
                ans[c]=arr[b]; b++;
            }
            c++;
        }
        while(a<m){
            ans[c]=arr[a];
            a++;c++;
        }
        while(b<e){
            ans[c]=arr[b];
            b++;c++;
        }
        for(int i = 0; i< e-s; i++){
            arr[s+i]=ans[i];
        }
    }
}