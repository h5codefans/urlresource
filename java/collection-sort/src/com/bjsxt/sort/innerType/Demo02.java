package com.bjsxt.sort.innerType;

import java.util.Arrays;

public class Demo02 {
  
	public static void main(String[] args) {
		String[] arr={"a","abcd","abc","ade"};
		//从大到小排序
		int i,j,p=0;
		for(i=0;i<arr.length-1;i++){
			for(j=0;j<arr.length-1-i;j++){
				if(((Comparable)arr[j]).compareTo(arr[j+1])<0){
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					p++;
				}
			}
		}
		System.out.println(Arrays.toString(arr)+"   交换次数："+p);
	}
}
