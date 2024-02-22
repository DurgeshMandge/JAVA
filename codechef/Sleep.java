import java.util.Scanner;

public class Sleep {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int z=0;z<t;z++){
            int n = sc.nextInt();
            int a ;
            boolean flag = true;
            for(int i=0;i<n;i++){
                a =sc.nextInt();
                if(a<5){
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }
            
        }
        sc.close();
	}
    }
