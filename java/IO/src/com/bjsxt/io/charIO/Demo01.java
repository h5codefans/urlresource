package com.bjsxt.io.charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 纯文本读取
 * 
 * @author Administrator
 *
 */
public class Demo01 {
    public static void main(String[] args){
    	//1.建立联系
    	File src=new File("F:mycode/a.txt");
    	//2.选择流
    	Reader reader=null;
    	try {
			reader=new FileReader(src);
			//读取操作
			char[] flush=new char[10];
			int len=0;
			while(-1!=(len=reader.read(flush))){
				//字符数组转字符转
				String str=new String(flush,0,len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("源文件不存在");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件读取失败");
		}finally{
			if(null!=reader){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("关闭失败");
				}
			}
		}
    	
    }
}
