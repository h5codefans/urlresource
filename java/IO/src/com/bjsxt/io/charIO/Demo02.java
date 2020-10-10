package com.bjsxt.io.charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo02 {
    public static void main(String[] args){
    	//1.创建源
    	File dest=new File("F:mycode/a.txt");
    	//选择流
    	Writer wr=null;
    	
    	try {
    		//为true，追加文件
			wr=new FileWriter(dest,true);
			//写出文件
			String msg="的首付款的技术开发是的飞\r\n";
			wr.write(msg);
			wr.append("的福克斯开始的分刻度飞1\r\n");
			
			wr.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(null!=wr){
				try {
					wr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
    	
    }
}
