package cn.bjsxt.testFile;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
		File f=new File("F:/mycode/6/Welcome.java");
		File f2=new File("F:/mycode/7");
		File f3=new File(f2,"TestDataType.java");
		File f4=new File(f2,"Tests.java");
		File f5=new File("F:/mycode/7/cc");
	
			//f4.createNewFile();
			f4.delete();
		   f5.mkdir();
		if(f.isFile()){
			System.out.println("是一个文件");
		}
		if(f2.isDirectory()){
			System.out.println("是一个目录");
		}
		
	}
}
