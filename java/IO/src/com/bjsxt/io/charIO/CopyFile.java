package com.bjsxt.io.charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 纯文本拷贝
 * @author Administrator
 *
 */
public class CopyFile {
   public static void main(String[] args){
	   File src=new File("F:mycode/a.txt");
	   File dest=new File("F:mycode/d.txt");
	   
	   Reader rd=null;
	   Writer wr=null;

		try {
			rd=new FileReader(src);
			wr=new FileWriter(dest,true);
			
			
			int len=0;
			char[] flush=new char[1024];
			while(-1!=(len=rd.read(flush))){
				wr.write(flush,0,len);
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
