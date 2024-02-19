import java.util.Scanner;

/**
 * A_Rectangle_Cutting
 */
public class A_Rectangle_Cutting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        for(int z=0; z<t ; z++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a%2 !=0 && b%2 !=0){
                System.out.println("No");continue;
            }
            if(a%2 ==0 && a != 2*b){
                System.out.println("Yes");continue;
            }
            if(b%2==0 && b != 2*a){
                System.out.println("Yes");continue;
            }

            System.out.println("No");            
        }
        sc.close();
    }
}