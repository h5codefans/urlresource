package cn.bjsxt.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Map的基本用法
 * @author Administrator
 *
 */
public class TestMap {
       public static void main(String[] args) {
		Map map=new HashMap();
		map.put("高淇", new Wife("张曼玉"));
		map.put("张三", new Wife("杨幂"));
		
		
		Wife w=(Wife)map.get("高淇");
		map.remove("高淇");
		
		System.out.println(map.containsKey("张三"));
		
		System.out.println(w.name);
	}
}

class Wife{
	String name;
	public Wife(String name){
		this.name=name;
	}
}
