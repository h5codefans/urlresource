package cn.bjsxt.lianxi01;

import java.util.Arrays;

public class Comparable {
     public static void main(String[] args){
    	 String[] arr={"ab","c","ac","bb","dc"};
    	 int i,j;
    	 boolean f=true;
    	 for(i=0;i<arr.length-1;i++){
    		 f=true;
    		 for(j=0;j<arr.length-1-i;j++){
    			 if(arr[j].compareTo(arr[j+1])<0){
    				 String temp=arr[j];
    				 arr[j]=arr[j+1];
    				 arr[j+1]=temp;
    				 f=false;
    			 }
    		 }
    		 if(f){
    			 break;
    		 }
    	 }
    	 System.out.println(Arrays.toString(arr));
     }
}
