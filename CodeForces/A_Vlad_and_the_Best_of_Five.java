import java.util.Scanner;

/**
 * A_Vlad_and_the_Best_of_Five
 */
public class A_Vlad_and_the_Best_of_Five {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int z=0;z<t;z++){
            int  a=0;
            String s = sc.next();
            for(char c: s.toCharArray()){
                if(c=='A'){
                    a++;
                }
            }
            System.out.println(a>2?"A":"B");
        }
    }
}