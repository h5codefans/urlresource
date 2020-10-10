package cn.bjsxt.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Demo05 {
   public static void main(String[] args){
	 //1.建立联系
   	File src=new File("F:/mycode/a.txt");
   	File dest=new File("F:/mycode/f.txt");
   	
   	Reader rd=null;
    Writer wr=null;
   	
   	try {
			rd =new FileReader(src);
			wr =new FileWriter(dest,true);
			
			char[] pp=new char[1024];
			int len=0;
			while(-1!=(len=rd.read(pp))){
				wr.write(pp,0,len);
			}
			wr.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(wr!=null){
				try {
					wr.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if(rd!=null){
				try {
					rd.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
   }
}
