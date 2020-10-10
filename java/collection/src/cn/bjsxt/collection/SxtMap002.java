package cn.bjsxt.collection;

import java.util.LinkedList;

/**
 * 自动义Map的升级版
 * 1.提供Map的查询效率
 * @author Administrator
 *
 */
public class SxtMap002 {
	
	LinkedList[] arr=new LinkedList[999];  //Map的底层结构是：数组+链表
	int size;
	
	public void put(Object key,Object value){
		SxtEntry e=new SxtEntry(key,value);
		int hash=key.hashCode();
		hash=hash<0?-hash:hash;
		
		int a=hash%arr.length;
		if(arr[a]==null){
			LinkedList list=new LinkedList();
			arr[a]=list;
			list.add(e);
		}else{
			
			LinkedList list=arr[a];
			for(int i=0;i<list.size();i++){
				SxtEntry e2=(SxtEntry)list.get(i);
				if(e2.key.equals(key)){
					 e2.value=value;  //键重复直接覆盖
					 return ;
				}
			}
			arr[a].add(e);
		}
		//a:1000-->1  b:10000-->13
	}
	
	public Object get(Object key){
		//return arr[key.hashCode()%999];
		int a=key.hashCode()%arr.length;
		if(arr[a]!=null){
			LinkedList list=arr[a];
			for(int i=0;i<list.size();i++){
				SxtEntry e=(SxtEntry)list.get(i);
				if(e.key.equals(key)){
					return e.value;
				}
			}
		}
		return null;
		
	}
	
   public static void main(String[] args) {
		SxtMap002 m=new SxtMap002();
		m.put("高淇", new Wife("杨幂"));
		m.put("张三", new Wife("李四"));
		Wife w=(Wife)m.get("张三");
		System.out.println(w.name);
  }
}
