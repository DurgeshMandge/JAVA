package SubSequencePermutation;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        String a = "1234";
        ArrayList<String> ans = perm(a);
        System.out.println(Arrays.toString(ans));
    }

    private static ArrayList<String> perm(String a) {
        return helper("",a);
    }

    private static ArrayList<String> helper(String u, String p) {
        if(p.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        int l = u.length() + 1;
        for(int i =0;i<l;i++){

        }
    }
}
