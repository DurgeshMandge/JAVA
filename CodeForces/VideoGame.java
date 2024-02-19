package CodeForces;

import java.util.*;
// import java.lang.*;
// import java.io.*;

class VideoGame
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner s = new Scanner(System.in);
	   int stacks = s.nextInt(); 
	   int maxH = s.nextInt();
	   int[] boxes = new int[stacks];
	   for (int i=0; i<boxes.length; i++){
	       boxes[i] = s.nextInt();
	   }
	   int input = s.nextInt();
	   int index=0;
	   int pickedIndex=0;
	   boolean picked = false;
	    loop : while(true){
	        switch (input){
	            case 0:
	                break loop;
	            case 1:
	                if(index!=0){
	                    index--;
	                }
	                break;
	            case 2:
	                if(index != boxes.length-1){
	                    index++;
	                }
	                break;
	            case 3:
	                if(boxes[index] != 0){
	                    boxes[index]--;
	                    picked=true;
	                    pickedIndex = index;
	                }else{
	                    picked=false;
	                }
	                break;
	            case 4:
	                if(picked){
	                    if(boxes[index]<maxH){
	                        boxes[index]++;
	                    }
	                    picked=false;
	                }
	                break;
	        }
	        input = s.nextInt();
	    }
        for(int i=0;i<boxes.length;i++){
            System.out.print(boxes[i] + " ");
        }
	}}

