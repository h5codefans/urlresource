package com.bjsxt.others.en;

import java.util.Arrays;
import java.util.StringTokenizer;

/**Enumeration 子类
 * StringTokenizer:String.plite()用于字符串的分割
 * 不支持正则表达式
 * @author Administrator
 *
 */
public class Demo02 {
    public static void main(String[] args){
    	String emailStr="bjsxt@163.com;bjsxt@qq.com;bjsxt@souhu.com";
    	StringTokenizer token=new StringTokenizer(emailStr,";");
    	//遍历
    	while(token.hasMoreElements()){
    		System.out.println(token.nextElement());
    	}
    }
}
