import java.util.*;

public class Leetcode385 {
    // public static void main(String[] args) {
    //     String[] arr = {"abdab","ab","abab"};
    //     int ans =0;
    //     for(int i=0; i<arr.length-1; i++){
    //         for(int j=i+1; j<arr.length; j++){
    //             if(isPrefixAndSuffix(arr[i], arr[j])){
    //                 ans++;
    //             }
    //         }
    //     }
    //     System.out.println(ans);
    // }
    // static boolean isPrefixAndSuffix(String a, String b){
    //     return b.startsWith(a) && b.endsWith(a);
    // }
    public static void main(String[] args) {
        int[] arr = {4,3,2,54,243,6};
        Arrays.sort(arr);
        Arrays.reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
