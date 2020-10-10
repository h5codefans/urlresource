package cn.bjsxt.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo02 {
   public static void main(String[] args){
	   //1.建立联系
	   File src=new File("F:/mycode/a.txt");
	   File dest=new File("F:/mycode/ww.txt");
	   //选择流
	   InputStream is=null;
	   OutputStream os=null;
	   
	   try {
		is = new FileInputStream(src);
		os = new FileOutputStream(dest,true);
		
		//3.读取操作
		byte[] car=new byte[1024];
		int len=0;
		while(-1!=(len=is.read(car))){
			os.write(car,0,len);
		}
		
		os.flush();   //强制刷新
	} catch (Exception e) {
		e.printStackTrace();
	}finally{
		try {
			os.close();
			is.close();
		} catch (Exception e2) {
            e2.printStackTrace();
		}
	}
   }
}
