//  744. Find Smallest Letter Greater than Target
//  https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {

    public static char nextGreatestLetter(char[] letters, char target) {
        if(target>=letters[letters.length-1]){return letters[0];}
        int start = 0 , end = letters.length-1 , mid;
        while(start<=end){
            mid=start+(end-start)/2;
            // if(target==letters[mid]){return letters[mid+1];}
            if(target<letters[mid]){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return letters[start];
    }
    public static void main(String[] args) {
        char[] arr = {'a','x','x','x','y'};
        System.out.println(nextGreatestLetter(arr, 'x'));;
    }
}
