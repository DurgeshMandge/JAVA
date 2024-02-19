import java.util.Scanner;

public class A_Recovering_a_Small_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int z =0;z<t;z++){
            int n = sc.nextInt()-1;
            int multiple = n/26;
            if(multiple==3){System.out.println("zzz");continue;}
            if(multiple==2){
                System.out.print((char)(97+n-52));
                System.out.print("zz");
                System.out.println();
            }
            if(multiple==1){
                System.out.print("a");
                System.out.print((char)(97+n-26-1));
                System.out.print("z");
                System.out.println();
            }
            if(multiple==0){
                System.out.print("aa");
                System.out.print((char)(97+n-2));
                System.out.println();
            }
        }
        sc.close();
    }
}