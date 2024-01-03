package SubSequencePermutation;

import java.util.*;

public class SubSet {
    public static void main(String[] args) {
        String a = "abc";
        subset("", a);
        System.out.println();
        ArrayList<String> ans = subset2("", a);
        System.out.println(ans);
    }

    private static ArrayList<String> subset2(String p, String u) {
        if(u.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> f = subset2(p, u.substring(1));
        ArrayList<String> s = subset2(p + u.charAt(0), u.substring(1));
        ArrayList<String> ans = new ArrayList<>();
        ans.addAll(0,f);
        ans.addAll(ans.size(),s);
        return ans;
    }

    private static void subset(String p, String u) {
        if(u.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        subset(p+u.charAt(0), u.substring(1));
        subset(p, u.substring(1));
    }
}
