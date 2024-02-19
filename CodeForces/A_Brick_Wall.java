import java.util.Scanner;

public class A_Brick_Wall{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();

        for(int i=0;i<z;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int c = m/2;
            System.out.println(c*n);
        }
    
    
    }
}