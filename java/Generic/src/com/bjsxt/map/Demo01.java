package com.bjsxt.map;

/**
 * key:String
 * value:自定义类型
 * 
 * "分拣"思路
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {
   
	public static void main(String[] args) {
		
		String str="this is a cat and that is a mice and where is the food";
		String[] strArray=str.split(" ");
		
		//存储到Map中
		Map<String,Letter> letters=new HashMap<String, Letter>();
		
		
/*		for(String temp:strArray){
			if(!letters.containsKey(temp)){
				letters.put(temp,new Letter());
			}
			
		    Letter col=letters.get(temp);
		    col.setCount(col.getCount()+1);
		}
*/
		
/*		for(String temp:strArray){
			if(!letters.containsKey(temp)){
				Letter col=new Letter();
				col.setCount(1);              //第一次值存放容器中
				letters.put(temp,col);
			}else {
				
			    Letter col=letters.get(temp);
			    col.setCount(col.getCount()+1);
			}

		}
*/
		for(String temp:strArray){
			Letter col=null;
			if(null==(col=letters.get(temp))){
	            col=new Letter();
				col.setCount(1);              //第一次值存放容器中
				letters.put(temp,col);
			}else {
				
			    col.setCount(col.getCount()+1);
			}

		}
		
		Set<String> keys=letters.keySet();
		for(String key:keys){
			Letter col=letters.get(key);
			System.out.println("字母："+key+",次数："+col.getCount());
		}
	}
}
