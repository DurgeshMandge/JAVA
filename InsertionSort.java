import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5,-2,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        int i = 0;
        while( i <= arr.length-2 && i >=0){
            boolean swapped = true;
            int j = i+1;
            while(j>0 && swapped){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                    swapped = true;
                    j--;
                }else{
                    swapped=false;
                }
            }
            i++;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
