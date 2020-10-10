package cn.bjsxt.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Demo01 {
   public static void main(String[] args) throws IOException{
	   //1.建立联系
	   File src=new File("F:/mycode/a.txt");
	   //2.选择流
	   InputStream sd=new FileInputStream(src);
	   
	   //3.读取操作
	   byte[] car=new byte[1024];
	   int len=0;
	   while(-1!=(len=sd.read(car))){
		   String info=new String(car,0,len);
		   System.out.println(info);
	   }
	   
	   sd.close();
   }
}
