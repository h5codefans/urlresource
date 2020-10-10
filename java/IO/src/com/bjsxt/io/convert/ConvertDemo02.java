package com.bjsxt.io.convert;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 转换流：字节转为字符
 * 1.输出流   OutputSteamWriter   编码
 * 2.输入流  InputStreamReader    解码
 */
public class ConvertDemo02 {
    public static void main(String[] args) throws IOException{
    	//指定解码字符集
    	BufferedReader br=new BufferedReader(
    			new InputStreamReader(
    					//c.txt  设置为GBK编码文件
    					new FileInputStream(new File("F:/mycode/c.txt")),"GBK")
    			);
    	String info=null;
    	while(null!=(info=br.readLine())){
    		System.out.println(info);
    	}
    	br.close();
    }
}
