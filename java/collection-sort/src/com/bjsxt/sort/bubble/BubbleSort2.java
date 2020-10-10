package com.bjsxt.sort.bubble;

import java.util.Arrays;

/**
 * 最终版本：考虑存在顺序
 * @author Administrator
 *
 */
public class BubbleSort2 {
    public static void main(String[] args) {
		int[] arr={1,3,2,4};
		int i,j,p=0;
		
		boolean sorted=true;
		for(i=0;i<arr.length-1;i++){
			sorted=true;
			for(j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					sorted=false;
					p++;
				}
			}
			if(sorted){
				break;
			}
		}
		System.out.println(Arrays.toString(arr)+"  交换次数："+p);
	}
}
