package com.bjsxt.others.synread;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 只读设置
 * 1.emptyxx()   空的不可变的集合
 *   emptyMap()
 *   emptySet()
 *   emptyList()
 * 2.singleton()   一个元素不可变的集合
 *   singletonList(T o) 
 *   singletonMap(K key, V value) 
 *   singleton(T o) 

 * 3.unmodifiablexx() 不可变容器
 *   unmodifiableList(List<? extends T> list) 
 *   unmodifiableMap(Map<? extends K,? extends V> m) 
 *   unmodifiableSet(Set<? extends T> s) 
 * @author Administrator
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		
      Map<String,String> map=new HashMap<String,String>();
      
      map.put("test","test");
      map.put("bjsxt","bjsxt");
      
      //控制只读
      Map<String,String> map2=Collections.unmodifiableMap(map);
      //map2.put("a","a");  //不能操作
      System.out.println(map2.size());
      
      //一个元素的容器测试
      List<String> list=Collections.singletonList(new String());
      list.add("test");
      //list.add("bjsxt");  //只能包含一个元素的容器
      System.out.println(list);
	}
	
	
//	public static Set<String> oper(Set<String> set){
//		if(null==set){
//			return Collections.EMPTY_SET;  //外部获取避免NullPointerException
//		}
//		//操作
//		return set;
//	}

}
