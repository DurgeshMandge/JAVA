import java.util.Arrays;
import java.util.Scanner;

public class C_Choose_the_Different_Ones {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        for(int p=0;p<z;p++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for(int i=0;i<n;i++){a[i]=sc.nextInt();}
            for(int i=0;i<m ;i++){b[i]=sc.nextInt();}
            Arrays.sort(a);
            Arrays.sort(b);

            int s=0;
            for (int i : a) {
                i=i^s;s=i;
            }
            s=0;
            for (int i : b) {
                i=i^s;s=i;
            }
        }
    }
}