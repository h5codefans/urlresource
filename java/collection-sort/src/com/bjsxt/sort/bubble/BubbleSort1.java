package com.bjsxt.sort.bubble;

import java.util.Arrays;

public class BubbleSort1 {
     public static void main(String[] args) {
		int[] arr={9,8,7,6,5};
		int i,j,p=0;
		for(i=0;i<arr.length-1;i++){
			for(j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					p++;
				}
			}
		}
		System.out.println(Arrays.toString(arr)+"   交换次数："+p);
	}
}
