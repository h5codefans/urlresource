package com.bjsxt.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 字符缓冲流+新增方法(不能发生多态)
 * @author Administrator
 *
 */
public class BufferedCharDemo {
    public static void main(String[] args){
    	//创建源  仅限于字符的纯文本
    	File src=new File("F:mycode/a.txt");
 	   File dest=new File("F:mycode/d.txt");
 	   //选择流
 	  BufferedReader rd=null;
 	  BufferedWriter wr=null;

 		try {
 			rd=new BufferedReader(new FileReader(src));
 			wr=new BufferedWriter(new FileWriter(dest,true));
 			
 			//读取操作
 			/*
 			int len=0;
 			char[] flush=new char[1024];
 			while(-1!=(len=rd.read(flush))){
 				wr.write(flush,0,len);
 			}
 			*/
 			String line=null;
 			while(null!=(line=rd.readLine())){
 				wr.write(line);
 			    wr.newLine();   //换行符号
 			}
 			wr.flush();
 		} catch (FileNotFoundException e) {
 			e.printStackTrace();
 		} catch (IOException e) {
 			e.printStackTrace();
 		}finally{
 		  if(null!=wr){
 			  try {
 				wr.close();
 			} catch (IOException e) {
 				e.printStackTrace();
 			}
 		  }
 		  if(null!=rd){
 			  try {
 				rd.close();
 			} catch (IOException e) {
 				e.printStackTrace();
 			}
 		  }
 		}
    }
}
