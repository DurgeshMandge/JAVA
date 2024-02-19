package CodeForces;

import java.util.*;
import java.lang.*;
import java.io.*;

class SmartPhones
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		// int N = 5;
		int[] arr = new int[N];
		// int[] arr = {40, 3, 65, 33, 21};
		for (int i =0; i<N; i++){
		    arr[i] = s.nextInt();
		}
		Arrays.sort(arr);//14 20 30 53
		int max =0;
		for(int i=0;i<arr.length;i++){
		if(arr[i] * (arr.length-i) > max){
		    max = arr[i] * (arr.length-i);
		}}
		System.out.println(Arrays.toString(arr));
		System.out.println(max);
	}
}

