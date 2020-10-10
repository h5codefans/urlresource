package com.bjsxt.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 加密工具类
 * @author Administrator
 *
 */
public class EncrptUtil {
	
	public static void main(String[] args) {
		encrpt("f:/myjava/com/bjsxt/bean/Emp.class","f:/myjava/com/bjsxt/bean/temp/Emp.class");
	}
    public static void encrpt(String src,String dest){
    	FileInputStream fis=null;
    	FileOutputStream fos=null;
    	
    	try {
			fis=new FileInputStream(src);
			fos=new FileOutputStream(dest);
			
			int temp=-1;
			while(-1!=(temp=fis.read())){
				fos.write(temp^0xff);   //取反操作
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    }
}
