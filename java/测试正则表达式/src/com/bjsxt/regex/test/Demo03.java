package com.bjsxt.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试正则表达式对象的替换
 * @author Administrator
 *
 */
public class Demo03 {
    public static void main(String[] args) {
		//在这个字符串：asbsd2533242，是否符合指定的正则表达式   \w+
    	
    	//表达式对象
    	Pattern p=Pattern.compile("[0-9]");
    	//创建Matcher对象
    	Matcher m=p.matcher("aa232**ssd445*sds232");
      
    	  //替换
        String newStr=m.replaceAll("#");
        System.out.println(newStr);
	}
}
