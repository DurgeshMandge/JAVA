package String;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String a = " hello  world  java";
        System.out.println(Arrays.toString(a.split(" ")));
        System.out.println(a.split(" ")[1].length());
    }
}
