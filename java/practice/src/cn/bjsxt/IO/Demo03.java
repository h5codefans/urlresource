package cn.bjsxt.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Demo03 {
    public static void main(String[] args){
       //1.建立联系
    	File src=new File("F:/mycode/a.txt");
    	//2.选择流
    	BufferedReader rd=null;
    	try {
			rd = new BufferedReader(new FileReader(src));
			
			String line=null;
			while(null!=(line=rd.readLine())){
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

    	
    }
}
