package virtualdiv3;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int carsize = sc.nextInt();
        if(carsize>0 && carsize<11){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
