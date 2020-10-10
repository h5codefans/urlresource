package com.bjsxt.sort.innerType;

import java.util.Arrays;
import java.util.Date;

public class Demo03 {
   public static void main(String[] args) {
	  Date[] arr=new Date[3];
	  arr[0]=new Date();
	  arr[1]=new Date(System.currentTimeMillis()-1000*60*60);
	  arr[2]=new Date(System.currentTimeMillis()+1000*60*60);
	  
		int i,j,p=0;
		for(i=0;i<arr.length-1;i++){
			for(j=0;j<arr.length-1-i;j++){
				if((arr[j]).compareTo(arr[j+1])<0){
					Date temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					p++;
				}
			}
		}
		System.out.println(Arrays.toString(arr)+"   交换次数："+p);
}
}
