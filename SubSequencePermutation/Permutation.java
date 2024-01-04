package SubSequencePermutation;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        String a = "abcde";
        // perm("",a);
        System.out.println(perm3("", a));
    }

    private static void perm(String p,String u) {
        if(u.isEmpty()){
            System.out.print(p+ " ");
            return;
        }
        int l = p.length();
        char ch = u.charAt(0);
        for(int i =0;i<=l;i++){
            perm(p.substring(0,i)+ch+p.substring(i,p.length()), u.substring(1));
        }
    }
    
    private static ArrayList<String> perm2(String p,String u) {
        if(u.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        int l = p.length();
        char ch = u.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i =0;i<=l;i++){
            ans.addAll(perm2(p.substring(0,i)+ch+p.substring(i,p.length()), u.substring(1)));
        }
        return ans;
    }
    
    private static int perm3(String p,String u) {
        if(u.isEmpty()){
            return 1;
        }
        int l = p.length();
        char ch = u.charAt(0);
        int sum = 0;
        for(int i =0;i<=l;i++){
            sum += perm3(p.substring(0,i)+ch+p.substring(i,p.length()), u.substring(1));
        }
        return sum;
    }
}
