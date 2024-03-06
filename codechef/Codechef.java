// package codechef;

import java.util.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int z=0;z<t;z++){
            int n=sc.nextInt();
            int qn=sc.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                sum+= a *2;
            }
            System.out.println(sum);
            for(int i=0;i<qn;i++){
                int q= sc.nextInt();
                if(q>sum || q<sum/2){
                    System.out.println(-1);
                    continue;
                }
                int diff = sum-q;  
            }
        }

	}
}

