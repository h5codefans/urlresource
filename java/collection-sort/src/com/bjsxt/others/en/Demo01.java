package com.bjsxt.others.en;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Enumeration的使用
 * 判断hasMoreElements()
 * 获取nextElement()
 * 
 * Vector的elements()方法
 * @author Administrator
 *
 */
public class Demo01 {
     public static void main(String[] args){
    	 Vector<String> vector=new Vector<String>();
    	 vector.add("javase");
    	 vector.add("hmtl");
    	 vector.add("oracle");
    	 
    	 //遍历Vector
    	 Enumeration<String> en=vector.elements();
    	 while(en.hasMoreElements()){
    		 System.out.println(en.nextElement());
    	 }
    	 
     }
}
