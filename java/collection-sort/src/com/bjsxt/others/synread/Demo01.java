package com.bjsxt.others.synread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 使用Collections管理同步  容器
 * synchronizedList()
 * synchronizedSet()
 * synchronizedMap()
 * @author Administrator
 *
 */
public class Demo01 {
    public static void main(String[] args){
    	List<String> list=new ArrayList<String>();
    	list.add("a");
    	list.add("b");
    	//list同步
    	List<String> synList=Collections.synchronizedList(list);
    	System.out.println("线程安全的list制作完毕");
    }
}
