import java.util.Scanner;

public class A_Make_it_White {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        for(int p=0;p<z;p++){
            int n = sc.nextInt();
            String s = sc.next();
            char[] c = s.toCharArray();
            int front=0,rear=s.length()-1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='B'){
                    front=i;
                    break;
                }
            }
            for(int i=s.length()-1; i>=0;i--){
                if(s.charAt(i)=='B'){
                    rear=i;
                    break;
                }
            }
            System.out.println(rear-front+1);
        }
    }
}