package com.bjsxt.io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * 不是所有的对象都可以序列化  java.io.NotSerializableException
 * 不是所有的属性都需要序列化    transient可以设置不需要序列化的属性
 * @author Administrator
 *
 */
public class ObjectDemo01 {
	public static void main(String[] args) throws ClassNotFoundException{
		try {
			seri("F:/mycode/seri.txt");
			read("F:/mycode/seri.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//反序列化
	public static void read(String destPath) throws IOException, ClassNotFoundException{
		
		//创建源
    	File src=new File(destPath);
    	//选择流
    	ObjectInputStream dis=new ObjectInputStream(
    			 new  BufferedInputStream(
    					   new FileInputStream(src)
    					 )
    			);
    	//操作读取的顺序与写出的一致  必须存在才能读取
         Object obj=dis.readObject();
         if(obj instanceof Employee){
        	 Employee emp=(Employee)obj;
        	 System.out.println(emp.getName());
        	 System.out.println(emp.getSalary());
         }
         
         obj=dis.readObject();
         int[] arr=(int[])obj;
         System.out.println(Arrays.toString(arr));
         
         dis.close();
	}
	//序列化
    public static void seri(String destPath) throws IOException, IOException{
    	Employee emp=new Employee("bjsxt",10000);
        int[] arr={1,2,3,4,5};	
    	//创建源
    	File dest=new File(destPath);
    	//选择流 ObjectOutputStream
    	ObjectOutputStream dos=new ObjectOutputStream(
    			  new BufferedOutputStream(
    					  new FileOutputStream(dest)
    					  )
    			);
    	
    	//操作  写出的顺序 为读取做准备
         dos.writeObject(emp);
    	 dos.writeObject(arr);
    	dos.flush();
    	//释放资源
    	dos.close();
    }
}
