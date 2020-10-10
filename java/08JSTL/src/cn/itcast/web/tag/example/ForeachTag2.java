package cn.itcast.web.tag.example;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ForeachTag2 extends SimpleTagSupport {
   
	private Object items;
	private String var;
	private Collection collection;

	public void setItems(Object items) {
		this.items = items;
		if(items instanceof Collection){
			collection=(Collection) items;
		}
		if(items instanceof Map){
			Map map=(Map) items;
			collection=map.entrySet(); 
		}
		
		if(items.getClass().isArray()){
			this.collection=new ArrayList();
			int length=Array.getLength(items);
			for(int i=0;i<length;i++){
				Object value=Array.get(items, i);
				this.collection.add(value);
			}
		}
		/*
		if(items instanceof Object[]){
			Object obj[]=(Object[]) items;
			collection=Arrays.asList(obj);
		}
		
		if(items instanceof int[]){
			int arr[]=(int[]) items;
			this.collection=new ArrayList();
			for(int i:arr){
				this.collection.add(i);
			}
		}
		if(items instanceof int[]){
			int arr[]=(int[]) items;
			this.collection=new ArrayList();
			for(int i:arr){
				this.collection.add(i);
			}
		}
		if(items instanceof int[]){
			int arr[]=(int[]) items;
			this.collection=new ArrayList();
			for(int i:arr){
				this.collection.add(i);
			}
		}
		if(items instanceof int[]){
			int arr[]=(int[]) items;
			this.collection=new ArrayList();
			for(int i:arr){
				this.collection.add(i);
			}
		}
		if(items instanceof int[]){
			int arr[]=(int[]) items;
			this.collection=new ArrayList();
			for(int i:arr){
				this.collection.add(i);
			}
		}
		if(items instanceof int[]){
			int arr[]=(int[]) items;
			this.collection=new ArrayList();
			for(int i:arr){
				this.collection.add(i);
			}
		}
		if(items instanceof int[]){
			int arr[]=(int[]) items;
			this.collection=new ArrayList();
			for(int i:arr){
				this.collection.add(i);
			}
		}
		if(items instanceof int[]){
			int arr[]=(int[]) items;
			this.collection=new ArrayList();
			for(int i:arr){
				this.collection.add(i);
			}
		}
		*/
	}

	public void setVar(String var) {
		this.var = var;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		
		Iterator it=this.collection.iterator();
		while(it.hasNext()){
			Object value=it.next();
			this.getJspContext().setAttribute(var, value);
			this.getJspBody().invoke(null);
		}
		
	}
}
