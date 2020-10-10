package com.bjsxt.io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据类型（基本数据类型+String)处理流
 * 1.输入流 DataInputStream     readxxx()
 * 2.输出流 DataOutputStream    writexxx()
 * 新增方法不能使用多态
 * 
 * java.io.EOFException  没有读取到相关的内容
 * @author Administrator
 *
 */
public class DataDemo01 {
    public static void main(String[] args){
    	try {
			//write("F:/mycode/data.txt");
    		read("F:/mycode/data.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    /**
     * 从文件读取数据+类型
     * @throws IOException 
     */
    
    public static void read(String destPath) throws IOException{
    	//创建源
    	File src=new File(destPath);
    	//选择流
    	DataInputStream dis=new DataInputStream(
    			 new  BufferedInputStream(
    					   new FileInputStream(src)
    					 )
    			);
    	//操作读取的顺序与写出的一致  必须存在才能读取
    	double num1=dis.readDouble();
    	long num2=dis.readLong();
    	String str=dis.readUTF();
    	
    	System.out.println(num2+"-->"+str);
    }
    /**
     * 数据+类型输出到文件
     * @throws IOException 
     */
    public static void write(String destPath) throws IOException{
    	double point=2.5;
    	long num=100L;
    	String str="数据类型";
    	
    	//创建源
    	File dest=new File(destPath);
    	//选择流   DataOutputStream
    	DataOutputStream dos=new DataOutputStream(
    			  new BufferedOutputStream(
    					  new FileOutputStream(dest)
    					  )
    			);
    	
    	//操作  写出的顺序 为读取做准备
    	dos.writeDouble(point);
    	dos.writeLong(num);
    	dos.writeUTF(str);
    	
    	dos.flush();
    	//释放资源
    	dos.close();
    }
}
