//  Search In Sorted Array
//  https://leetcode.com/problems/search-a-2d-matrix/description/

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = { {  1,   2,   4,   5},
                        {  6,   7,   8,   9},
                        { 10,  11,  12,  13},
                        { 14,  15,  16,  17},
                        { 18,  19,  21,  34}
                     };
        int target = 12;
        System.out.println(Arrays.toString(searchInSortedMatrix(arr,target)));
    }

    private static int[] searchInSortedMatrix(int[][] arr, int target) {
        int midCol = arr[0].length/2;
        int start = 0, end = arr.length-1, midRow;

        while(start < end-1){// reduce searchSpace to 2 columns
            midRow = start + (end-start)/2;
            if( target == arr[midRow][midCol]){
                return new int[]{midRow,midCol};
            }
            if(target > arr[midRow][midCol]){
                start = midRow;
            }else{
                end = midRow;
            }
        }

        if(target<arr[start][midCol]){// search in first quadrant
            return binarySearch(arr,start,0,midCol-1,target);
        }

        if(target>arr[end][midCol]){// search in second quadrant
            return binarySearch(arr, end, midCol+1, arr[0].length-1,target);
        }

        if(target > arr[start][midCol] && target < arr[end][0]){// search in third quadrant
            return binarySearch(arr,start,midCol+1,arr[0].length-1,target);
        }

        if(target<arr[end][midCol] && target > arr[start][arr[0].length-1]){// search in forth quadrant
            return binarySearch(arr, end,0, midCol-1,target);
        }
        
        return new int[]{-1,-1};
    }

    private static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd,int target) {
        int midCol;
        while(cStart<=cEnd){
            midCol = cStart + (cEnd-cStart)/2;
            if(arr[row][midCol]==target){
                return new int[]{row,midCol};
            }
            if(target < arr[row][midCol]){
                cEnd = midCol-1;
            }else{
                cStart = midCol +1;
            }
        }

        return new int[]{-1,-1};
    }
}
