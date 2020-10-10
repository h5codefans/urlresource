package com.bjsxt.io.byteIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 写出文件
 * 1.建立联系   File对象    目的地
 * 2.选择流     文件输出流   OutputStream  FileOutStream
 * 3.操作： write()+flush
 * 4.释放资源：关闭
 * @author Administrator
 *
 */
public class Demo02 {
   public static void main(String[] args){
	   //1.建立联系   File对象    目的地
	   File dest=new File("F:/mycode/b.txt");
	   //2.选择流     文件输出流   OutputStream  FileOutStream
	   OutputStream os=null;
	   try {
		//一追加的形式 写出文件，必须为true
		os=new FileOutputStream(dest,true);
		//3.操作
		String str="bjsxt is very good\r\n";
		//字符串转字节数组
		byte[] data=str.getBytes();
		os.write(data,0,data.length);
		
		os.flush();  //强制刷新输出
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println("文件未找到");
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println("文件写出失败");
	}finally{
		//4.释放资源：关闭
		if(null!=os){
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("关闭输出流失败");
			}
		}
	}
	   
   }
}
