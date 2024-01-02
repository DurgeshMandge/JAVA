package SubSequencePermutation;


public class RemoveA {
    public static void main(String[] args) {
        String a = "aldifalksfaijsfasd";
        String b = removeA("",a);
        String c = removeA(a);
        System.out.println(b.equals(c));
    }

    private static String removeA(String a) {
        if( a.isEmpty()){
            return "";
        }
        String ans;
        if(a.charAt(0) == 'a'){
            ans = removeA(a.substring(1));
        }else{
            ans =a.charAt(0) + removeA(a.substring(1));
        }
        return ans;
    }

    private static String removeA(String ans, String a) {
        if(a.length()==0){
            return ans;
        }
        if(a.charAt(0)=='a'){
            return removeA(ans, a.substring(1, a.length()));
        }else{
            return removeA(ans + a.charAt(0), a.substring(1, a.length()));
        }
    }

}
