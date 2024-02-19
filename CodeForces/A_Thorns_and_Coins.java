import java.util.Scanner;

public class A_Thorns_and_Coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        loop:for(int z=0; z<t; z++){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            char[] ch = s.toCharArray();

            int i = -1 , ans =0;
            while ( i+1 < n && i+1<ch.length) {
                if(ch[i+1] == '.'){
                    i++;
                }else 
                if(ch[i+1] == '@'){
                    i++;
                    ans++;
                }else
                if(ch[i+1] == '*'){
                    if(i+2 >=n){
                        break loop;
                    }
                    if(ch[i+2]=='.'){
                        i+=2;
                    }else if (ch[i+2]=='@'){
                        i+=2;ans++;
                    }else{
                        break loop;
                    }
                }else{
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}