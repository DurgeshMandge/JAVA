package SubSequencePermutation;

import java.util.ArrayList;
import java.util.List;

public class PhoneCombination {
    public static void main(String[] args) {
        String a = "23";
        System.out.println(letterCombinations(a));
    }

    public static List<String> letterCombinations(String digits) {
        return helper("",digits);
    }

    public static ArrayList<String> helper(String p, String u){
        if(u.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char ch = u.charAt(0);
        ArrayList<String> l = new ArrayList<>();
        
    }
}
