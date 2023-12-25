import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = { {  1,   2,   4},
                        {  6,   7,   8},
                        { 10,  11,  13}
                     };
        int target = 8;
        System.out.println(Arrays.toString(searchInSortedMatrix(arr,target)));
    }

    private static int[] searchInSortedMatrix(int[][] arr, int target) {
        int midCol = arr[0].length/2;
        while()
    }
}
