import java.util.Arrays;

public class RowColumnMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 2,  4,   7 },
                        { 3,  9,  13 },
                        { 6, 11,  14 }
                    };
        int target = 6;
        System.out.println(Arrays.toString(searchInRowColMatrix(arr,target)));//ans=[2,1]
    }

    private static int[] searchInRowColMatrix(int[][] arr, int target) {
        int rows = arr.length , cols = arr[0].length;
        int r = 0, c = cols-1;
        while(r<=rows && c >= 0){
            if(arr[r][c]==target){return new int[]{r,c};}
            if(target < arr[r][c]){
                c--;
            }else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
