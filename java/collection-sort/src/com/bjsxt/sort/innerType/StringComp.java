package com.bjsxt.sort.innerType;

import java.util.Comparator;

/**
 * 排序规则的业务类
 * 正数>
 * 负数<
 * 0 =
 * @author Administrator
 *
 */
public class StringComp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
         int len1=o1.length();
         int len2=o2.length();
         
         return -(len1-len2);
	}
   
    	/**
    	 * 按长度笔比较大小
    	 */
	  
}
