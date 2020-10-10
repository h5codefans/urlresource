package com.bjsxt.sort.refType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * 使用Collections
 * @author Administrator
 *
 */
public class NewItemApp {
   public static void main(String[] args) {
	List<NewItem> news=new ArrayList<NewItem>();
	news.add(new NewItem("test1",100,new Date()));
	news.add(new NewItem("test2",50,new Date(System.currentTimeMillis()-1000*60*60)));
	news.add(new NewItem("test3",60,new Date(System.currentTimeMillis()-1000*60*60)));
	
	System.out.println("排序前："+news);
	//排序
	Collections.sort(news);
	System.out.println("排序后："+news);
}
}
