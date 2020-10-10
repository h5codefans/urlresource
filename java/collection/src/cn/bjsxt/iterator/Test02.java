package cn.bjsxt.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test02 {

	 public static void main(String[] args) {
		Map map=new HashMap();
		map.put("name", "高淇");
		map.put("abc", "sdf");
		Set keys=map.keySet();
		for(Iterator iter=keys.iterator();iter.hasNext();){
			String keyStr=(String) iter.next();
			System.out.println(keyStr);
		}
	}
}
