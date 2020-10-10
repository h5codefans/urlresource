package com.bjsxt.sort.innerType;

import java.util.Comparator;
import java.util.List;

/**
 * 排序
 * @author Administrator
 *
 */


public class Utils {
	
	/**
	 * List排序+比较器
	 * 
	 */
	public static <T> void sort(List<T> list,Comparator<T> com){
		        //第一步：转换成数组
				Object[] arr=list.toArray();
				sort(arr,com);
				//第二步：改变容器中所对应的值
				for(int i=0;i<arr.length;i++){
					list.set(i, (T)(arr[i]));
				}
	}
	
	/**
	 * 数组排序(降序)+Comparator接口
	 * @param <T>
	 * @param arr
	 */
  public static <T> void sort(Object[] arr,Comparator<T> com){
	  int i,j;
		for(i=0;i<arr.length-1;i++){
			for(j=0;j<arr.length-1-i;j++){
				if((com.compare((T)arr[j], (T)arr[j+1]))<0){
					Object temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
  }
  /**
   * 容器排序
   */
	
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void sort(List<T> list){
		//第一步：转换成数组
		Object[] arr=list.toArray();
		sort(arr);
		//第二步：改变容器中所对应的值
		for(int i=0;i<arr.length;i++){
			list.set(i, (T)(arr[i]));
		}
	}
   /**
    * 数组排序(使用泛型方法)
    * 
    */
	
	public static <T extends Comparable<T>>void sort(T[] arr){
		int i,j;
		for(i=0;i<arr.length-1;i++){
			for(j=0;j<arr.length-1-i;j++){
				if(((Comparable)arr[j]).compareTo(arr[j+1])<0){
					T temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
  }
	/**
	 * 数组排序(降序)
	 * @param arr
	 */
  public static void sort(Object[] arr){
	  int i,j;
		for(i=0;i<arr.length-1;i++){
			for(j=0;j<arr.length-1-i;j++){
				if(((Comparable)arr[j]).compareTo(arr[j+1])<0){
					Object temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
  }
}
