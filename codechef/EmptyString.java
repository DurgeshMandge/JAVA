// import Arrays
public class EmptyString {
    public static void main(String[] args) {
        String s = "aabcbbca";
        int[] arr = new int[26];
        for(int i=0;i<26;i++){arr[i]=0;}
        int max =0;
        String ans = "";
        for(char c : s.toCharArray()){
            arr[c-97] = arr[c-97]+1;
            max = max>arr[c-97] ? max : arr[c-97];
        }
        for(int i=0;i<26;i++){
            if(arr[i]==max){
                ans+= (char)('a'+i);
            }
        }
        for(int i=0;i<26;i++){System.out.print(arr[i]);}
        System.out.println();
        System.out.println( ans);
    }
}
